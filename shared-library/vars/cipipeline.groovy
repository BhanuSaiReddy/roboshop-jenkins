def call() {
    node('Workstation') {
        stage('Compile code') {
            common.compile()
        }

    stage('test') {
        print "hello"
    }

    stage('Compile Quality') {
        print "hello"
    }

    stage('Code security') {
        print "hello"
    }

    stage('Release') {
        print "hello"
    }
}
