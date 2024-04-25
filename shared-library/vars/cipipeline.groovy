def call() {

    node('workstation') {
        stage('Compile code') {
            common.compile
        }
        print "hello"
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
        echo "hello"
    }
}
}
