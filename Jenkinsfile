pipeline {
    agent {
        label 'linux'
    }
    tools {
        maven 'Maven 3.8.6'
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