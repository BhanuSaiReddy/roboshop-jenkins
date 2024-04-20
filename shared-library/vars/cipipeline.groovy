def call() {
    pipeline {
        agent any

        stages {
            stage('compile code') { // Corrected syntax here
                steps {
                    sh 'env'
                }
            }

            stage('test') { // Corrected syntax here
                steps {
                    echo 'hello world'
                }
            }

            stage('Code quality') { // Corrected syntax here
                steps {
                    echo 'hello world'
                }
            }
        }
    }
}
