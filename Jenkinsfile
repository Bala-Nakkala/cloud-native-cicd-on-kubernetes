pipeline {
    agent {
        kubernetes {
            yamlFile 'jenkins/pod-template.yaml'
            defaultContainer 'maven'
        }
    }

    stages {

        stage('Verify Agent') {
            steps {

                container('maven') {
                    sh 'mvn -version'
                }

                container('kubectl') {
                    sh 'kubectl version --client'
                }

                container('helm') {
                    sh 'helm version'
                }

                container('trivy') {
                    sh 'trivy --version'
                }

                container('kaniko') {
                    sh 'ls -la /kaniko'
                }

            }
        }
    }
}
