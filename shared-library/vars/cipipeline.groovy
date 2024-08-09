def call() {
    node('workstation') {
        stage('Cleanup') {
            sh "find . | sed -e '1d' | xargs rm -rf"
        }

        // Setting the branch_name based on the TAG_NAME or BRANCH_NAME
        if (env.TAG_NAME ==~ ".*") {
            env.branch_name = "refs/tags/${env.TAG_NAME}"
        } else {
            env.branch_name = "${env.BRANCH_NAME}"
        }

        stage('Checkout') {
            git branch: "$BRANCH_NAME", url: "https://github.com/BhanuSaiReddy/${component}"
        }

        if(env.TAG_NAME ==~ ".*") {
            common.compile()
            common.release()
        } else {
            if(env.BRANCH_NAME == "main") {
                common.compile()
                common.test()
                common.codeQuality()
                common.codeSecurity()
            } else {
                common.compile()
                common.test()
                common.codeQuality()
            }
        }

    }

}