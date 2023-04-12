pipeline {
    agent any
    stages {
        stage('Running tests cases') {
            steps {
                      sh "mvn clean install -DskipTests"
                      sh " mvn test -Dmaven.test.failure.ignore=true"

            }
        }

        stage('reports') {
            steps {
                script {
                            publishHTML(
                                      target: [
                                              allowMissing         : false,
                                              alwaysLinkToLastBuild: false,
                                              keepAll              : true,
                                              reportDir            : 'target/surefire-reports',
                                              reportFiles          : 'index.html',
                                              reportName           : "Report"
                                      ]
                              )
                }
            }
        }
    }
}