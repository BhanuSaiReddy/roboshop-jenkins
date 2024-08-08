def call() {
    node('workstation') {
        stage('Compile Code') {
            echo 'Compiling code...'
            // Load the compile.groovy file and call the compile function
            load 'path/to/compile.groovy'
            compile()
        }
        stage('Test') {
            echo 'Running tests...'
            // Add your test commands here
        }
        stage('Code Quality') {
            echo 'Running code quality checks...'
            // Add your code quality analysis commands here
        }
        stage('Code Security') {
            echo 'Running code security checks...'
            // Add your code security scan commands here
        }
        stage('Release') {
            echo 'Releasing the application...'
            // Add your release steps here
        }
    }
}
