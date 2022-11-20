pipeline {
    agent {
        label 'linux'
    }
    tools {
        maven 'maven'
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
        stage('compile') {
            steps {
                echo 'Kompilacja'
                withMaven {
                    sh 'mvn compile'
                }
            }
        }
        stage('test') {
            steps {
                echo 'Testowanie'
                withMaven {
                    sh 'mvn test'
                }
            }
        }
    }
}