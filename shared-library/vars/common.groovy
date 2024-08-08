def compile() {
    if (env.codeType == "maven") {
        println "maven"
        // Add maven compile steps here
    }

    if (env.codeType == "nodejs") {
        println "nodejs"
        // Add nodejs compile steps here
    }

    if (env.codeType == "python") {
        println "Python"
        // Add python compile steps here
    }

    if (env.codeType == "static") {
        println "static"
        // Add static compile steps here
    }
}
