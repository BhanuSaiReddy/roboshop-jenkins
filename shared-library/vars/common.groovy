def compile() {
    if (env.codeType == "python" || env.codeType == "static") {
        // Add logic if needed
    }

    stage('Compile Code') {
        if (env.codeType == "maven") {
            sh '/home/centos/maven/bin/mvn package'
        }
        if (env.codeType == "nodejs") {
            sh 'npm install'
        }
        if (env.codeType == "python") {
            echo "Python"
        }
        if (env.codeType == "static") {
            echo "static"
        }
    }
}

def test() {
    stage('Test Cases') {
        echo 'Test'
    }
}

def codeQuality() {
    stage('Code Quality') {
        echo 'codeQuality'
    }
}

def codeSecurity() {
    stage('Code Security') {
        echo 'codeSecurity'
    }
}

def release() {
    stage('Release') {
        echo 'release'
    }
}
