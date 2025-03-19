pipeline {
    agent any
    environment {
        JAVA_HOME = "C:\\Program Files\\Java\\jdk-21"
        PATH = "${JAVA_HOME}\\bin;${env.PATH}"
    }
    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/madhuk54/jenkins.git'
            }
        }
        stage('Compile Java') {
            steps {
                bat 'javac Factorial.java'
            }
        }
        stage('Run Java Program') {
            steps {
                input message: 'Enter a number (N) for factorial generation:', parameters: [
                    string(name: 'NUMBER', defaultValue: '5', description: 'Enter a positive integer')
                ]
                bat "echo ${NUMBER} | java Factorial"
            }
        }
    }
}
