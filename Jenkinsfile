pipeline {
    agent any
    stages {
        stage('Running tests cases') {
            steps {
                      sh "mvn clean install -DskipTests"
                      sh " mvn test -Dmaven.test.failure.ignore=true"

            }
        }
    }
}