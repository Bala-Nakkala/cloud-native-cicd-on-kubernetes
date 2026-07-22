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
                          --destination=docker.io/balu9963/springboot-demo:latest \
                          --cache=true
                    '''
                }
            }
        }
    }
}