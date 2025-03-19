pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/madhuk54/Project.git',credentialsId:"token"
            }
        }
        stage('Compile Java') {
            steps {
                bat 'javac -d . Factorial.java' // Ensure correct classpath
            }
        }
        stage('Run Java Program') {
            steps {
                bat 'java Project.Factorial'  // Change based on package
            }
        }
    }
}
