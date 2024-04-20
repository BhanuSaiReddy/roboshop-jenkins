def call() {
    pipeline {
        agent any

        stages {
            stage('Compile Code') { // Corrected syntax here
                steps {
                    sh 'env'
                }
            }

            stage('Test') { // Corrected syntax here
                steps {
                    echo 'hello world'
                }
            }

            stage('Code Quality') { // Corrected syntax here
                steps {
                    echo 'hello world'
                }
            }
        }
    }
}
