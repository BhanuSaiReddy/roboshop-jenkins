def call() {
    pipeline {
        agent any

        stages {
            stage('Compile code') {
                steps {
                    sh 'env'
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
                when {
                    expression { BRANCH_NAME == "main" }
                }
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
