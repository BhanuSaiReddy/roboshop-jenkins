def call() {
    pipeline {
        agent any

        stages {
            stage('Compile code') {
                steps {
                    sh 'env'
                }
            }

            stage('Test') {
                when {
                    allof {
                        expression { env.BRANCH_NAME != null }
                        expression { env.TAG_NAME == null }
                    }
                }
                steps {
                    echo 'hello world'
                }
            }

            stage('Code Quality') {
                when {
                    allof {
                        expression { env.BRANCH_NAME != null }
                        expression { env.TAG_NAME == null }
                    }
                }
                steps {
                    echo 'hello world'
                }
            }

            stage('Code Security') {
                when {
                    expression { BRANCH_NAME == "main" }
                }
                steps {
                    echo 'hello world'
                }
            }

            stage('Release') {
                when {
                    expression { env.TAG_NAME ==~ ".*" }
                }
                steps {
                    sh 'env'
                    echo 'hello world'
                }
            }
        }
    }
}
