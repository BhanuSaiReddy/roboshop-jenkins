def call() {
    pipeline {
        agent any

        stages {
            stage{'compile code'}{
                steps {
                    sh 'env'
                }
            }

            stage{'test'}{
                steps {
                    echo 'hello world'
                }
            }

            stage{'Code quality'}{
                steps {
                    echo 'hello world'
                }
            }