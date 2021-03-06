
def call(body) {
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    withMaven() {
        sh '''
            mvn -B clean package
           '''
    }
}
