pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/tuo-username/jenkins-git-integration.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
                // Aggiungi qui i tuoi comandi di build, ad esempio:
                // sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                // Aggiungi qui i tuoi comandi di test, ad esempio:
                // sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Aggiungi qui i tuoi comandi di deploy, ad esempio:
                // sh 'scp target/*.jar user@server:/path/to/deploy'
            }
        }
    }
}