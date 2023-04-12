pipeline {
    agent any
    stages {
        stage('Running tests cases') {
            steps {
                      sh "mvn clean install -DskipTests"
                      sh "mvn -Dmaven.test.failure.ignore=true"

            }
        }
    }
}