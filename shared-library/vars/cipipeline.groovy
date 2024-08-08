def call() {

    node('workstation')
        sh "find . | sed -e '1d' |xargs rm -rf "
        git branch: 'main', url:'https://github.com/BhanuSaiReddy/${component}'
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