def call() {
    node('workstation') {
        stage('Cleanup') {
            sh "find . | sed -e '1d' | xargs rm -rf"
        }
        stage('Checkout') {
            git branch: "$BRANCH_NAME" , url: "https://github.com/BhanuSaiReddy/${component}"
        }
        stage('Compile Code') {
            common.compile()
        }
        stage('Test') {
            print 'hello'
        }
        stage('Code Quality') {
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
