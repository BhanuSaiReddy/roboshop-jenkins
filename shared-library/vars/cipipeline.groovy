def call() {
    node('workstation') {
        stage('Compile code') {
            common.compile
        }
        echo "hello"
    }

    stage('test') {
        echo "hello"
    }

    stage('Compile Quality') {
        echo "hello"
    }

    stage('Code security') {
        echo "hello"
    }

    stage('Release') {
        echo "hello"
    }
}
