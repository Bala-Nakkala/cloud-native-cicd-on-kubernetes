pipeline {

    agent {
        label 'maven-docker'
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
                    dir('app') {
                        sh 'chmod +x mvnw'
                        sh './mvnw clean package'
                    }
                }
            }
        }

        stage('Docker Build') {
            steps {
                container('docker') {
                    dir('app') {
                        sh 'docker version'
                        sh 'docker build -t springboot-demo:v1 .'
                    }
                }
            }
        }
    }
}