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

        stage('Docker Check') {
    steps {
        container('docker') {
            sh 'docker version'
            sh 'docker info'
        }
    }
}