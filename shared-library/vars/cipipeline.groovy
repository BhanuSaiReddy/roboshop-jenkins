def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def call() {
    pipeline {
        agent any

        stages {
            stage('Compile code') {
                steps {
                    echo 'hello world'
                    script {
                        info 'Starting'
                        warning 'Nothing to do!'
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

            stage('App Deploy') {
                steps {
                    echo 'hello world'
                }
            }
        }
    }
}
