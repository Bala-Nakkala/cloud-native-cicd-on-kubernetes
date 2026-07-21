pipeline {
    agent {
        label 'maven-docker'
    }

    environment {
        IMAGE_NAME = "balu9963/springboot-demo"
        IMAGE_TAG = "${BUILD_NUMBER}"
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build JAR') {
            steps {
                container('maven') {
                    dir('app') {
                        sh 'mvn clean package -DskipTests'
                    }
                }
            }
        }

        stage('Build & Push Image') {
            steps {
                container('kaniko') {
                    sh '''
                    /kaniko/executor \
                      --dockerfile=$WORKSPACE/app/Dockerfile \
                      --context=$WORKSPACE/app \
                      --destination=$IMAGE_NAME:$IMAGE_TAG
                    '''
                }
            }
        }

    }

    post {
        success {
            echo "Image pushed successfully: ${IMAGE_NAME}:${IMAGE_TAG}"
        }
        failure {
            echo "Pipeline failed!"
        }
    }
}
