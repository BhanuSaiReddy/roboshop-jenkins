def call() {
    node('workstation') {
        stage('Compile Code') {
            steps {
                echo 'Compiling code...'
                // Replace with your actual compile steps
                // common.compile()
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add your test commands here
            }
        }
        stage('Code Quality') {
            steps {
                echo 'Running code quality checks...'
                // Add your code quality analysis commands here
            }
        }
        stage('Code Security') {
            steps {
                echo 'Running code security checks...'
                // Add your code security scan commands here
            }
        }
        stage('Release') {
            steps {
                echo 'Releasing the application...'
                // Add your release steps here
            }
        }
    }
}
