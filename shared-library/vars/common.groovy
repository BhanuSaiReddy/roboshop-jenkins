def compile() {
    if (env.codeType == "python" || env.codeType == "static") {
        echo "Return, Do not need Compilation"
        return

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
        env.sonaruser = sh(script: ' aws ssm get-parameter --name "sonarqube.user" --with-decryption --query "Parameter.Value" |xargs', returnStdout: true).trim()
        env.sonarpass = sh(script: 'aws ssm get-parameter --name "sonarqube.pass" --with-decryption --query="Parameter.Value" |xargs', returnStdout: true).trim()
        wrap([$class: "MaskPasswordsBuildWrapper", varPasswordPairs: [[password: sonarpass]]]) {
            sh "sonar-scanner -Dsonar.host.url=http://172.31.15.74:9000 -Dsonar.login=${sonaruser} -Dsonar.password=${sonar.pass} -Dsonar.projectKey=${component} -Dsonar.qualitygate.wait=true"
        }
    }
}
def release() {
    stage('Release') {
        echo 'release'
    }
}
