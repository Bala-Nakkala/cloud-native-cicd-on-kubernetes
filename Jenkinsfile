pipeline {
    agent {
        kubernetes {
            yamlFile 'jenkins/pod-template.yaml'
            defaultContainer 'maven'
        }
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                container('maven') {
                    sh '''
                        cd app
                        ./mvnw clean compile
                    '''
                }
            }
        }

        stage('Unit Test') {
            steps {
                container('maven') {
                    sh '''
                        cd app
                        ./mvnw test
                    '''
                }
            }
        }

        stage('Package') {
            steps {
                container('maven') {
                    sh '''
                        cd app
                        ./mvnw package -DskipTests
                    '''
                }
            }
        }

        stage('Build & Push Docker Image') {
            steps {
                container('kaniko') {
                    sh '''
                        /kaniko/executor \
                          --context=${WORKSPACE}/app \
                          --dockerfile=${WORKSPACE}/app/Dockerfile \
                          --destination=docker.io/balu9963/springboot-demo:${BUILD_NUMBER} \
                          --destination=docker.io/balu9963/springboot-demo:latest \
                          --cache=true
                    '''
                }
            }
        }

        stage('Update GitOps Repository') {
            steps {
                container('maven') {

                    withCredentials([usernamePassword(
                        credentialsId: 'github-creds',
                        usernameVariable: 'GIT_USER',
                        passwordVariable: 'GIT_TOKEN'
                    )]) {

                        sh '''
                            rm -rf springboot-gitops

                            git clone https://${GIT_USER}:${GIT_TOKEN}@github.com/Bala-Nakkala/springboot-gitops.git

                            cd springboot-gitops

                            sed -i "s/tag:.*/tag: ${BUILD_NUMBER}/" helm/values.yaml

                            git config user.email "jenkins@local"

                            git config user.name "Jenkins"

                            git add .

                            git commit -m "Updated image tag to ${BUILD_NUMBER}" || true

                            git push origin main
                        '''
                    }
                }
            }
        }
    }
}
