def call() {
    pipeline {
        agent any

        stages {
            stage('Compile Code') {
                steps {
                    sh 'env'
                }
            }

            stage('Test') {
                steps {
                    echo 'Hello World'
                }
            }

            stage('Code Quality') {
                steps {
                    echo 'Hello World'
                }
            }

            stage('Code Security') {
                when {
                    // Add conditions here if needed
                    expression { return true } // Placeholder to always execute this stage
                }
                steps {
                    echo 'Hello World'
                }
            }
        }
