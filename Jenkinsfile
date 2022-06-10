pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                //git branch: 'main', url: 'https://github.com/rodauher/Hello-Springboot.git'
                sh "./gradlew test assemble"
            }
            post {
                success {
                    junit 'build/test-results/test/*.xml'
                    archiveArtifacts 'build/libs/*jar'
                }
            }
        }
    }
}