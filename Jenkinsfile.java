pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/Ste0981/jenkins-git-integration.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
                // Aggiungi i tuoi comandi di build qui
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                // Aggiungi i tuoi comandi di test qui
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Aggiungi i tuoi comandi di deploy qui
            }
        }
    }
}
