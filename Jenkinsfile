pipeline {
    agent {
        label 'maven-docker'
    }

    stages {

        stage('Docker Test') {
            steps {
                container('docker') {
                    sh 'docker version'
                    sh 'docker info'
                }
            }
        }

    }
}
