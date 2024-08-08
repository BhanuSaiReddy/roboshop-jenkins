def compile() {
    switch (env.codeType) {
        case "maven":
            println "maven"
            break
        case "nodejs":
            println "nodejs"
            break
        case "python":
            println "Python"
            break
        case "static":
            println "static"
            break
        default:
            println "Unknown code type"
    }
}
