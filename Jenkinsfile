pipeline {
    agent {
        label 'linux'
    }

    stages {
        stage('clean') {
            steps {
                echo 'Czyszczenie!'
                withMaven {
                    sh 'mvn clean'
                }
            }
        }
    }
}