def call() {
    pipeline {
        agent any

        stages {
            stage('Compile code') {
                steps {
                    sh 'env'
                    } // Closing the script block
                }
            }

            stage('Test') {
                steps {
                    echo 'hello world'
                }
            }

            stage('Code Quality') {
                steps {
                    echo 'hello world'
                }
            }

            stage('Code Security') {
                steps {
                    echo 'hello world'
                }
            }

            stage('Release') {
                steps {
                    echo 'hello world'
                }
            }
        }
    }
}
