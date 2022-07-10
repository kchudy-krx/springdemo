pipeline {
    agent {
        label 'linux'
    }

    stages {
        stage('clean') {
            steps {
                echo 'Czyszczenie!'
                script {
                    sh 'mvn clean'
                }
            }
        }
    }
}