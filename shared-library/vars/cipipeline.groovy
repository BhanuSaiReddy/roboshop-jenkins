def call() {

    node('workstation') {
        stage('compile Code') {
            common.compile()
        }
        stage('Test') {
            print 'hello'
        }
        stage('Code  Quality') {
            print 'hello'
        }

        stage('Code Security') {
            print 'hello'
        }
        stage('Release') {
            print 'Hello'
        }
    }
}