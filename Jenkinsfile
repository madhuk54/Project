pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/madhuk54/Project.git'
            }
        }
        stage('Compile Java') {
            steps {
                bat 'javac Factorial.java'
            }
        }
        stage('Run Java Program') {
            steps {
                bat 'java Factorial'
            }
        }
    }
}

