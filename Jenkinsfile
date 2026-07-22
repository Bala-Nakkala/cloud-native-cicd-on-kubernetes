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

        stage('Trivy Filesystem Scan') {
    steps {
        container('maven') {
            sh '''
                cd app
                ./mvnw dependency:resolve
            '''
        }

        container('trivy') {
            sh '''
                trivy fs \
                --scanners vuln \
                app/
            '''
        }
    }
}