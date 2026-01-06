pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('build') {
            steps {
                echo 'build app'
            }
        }
        stage('deploy') {
            steps {
                echo 'deploy app'
            }
        }
        
    }
    post 
    {
       
        always
        {
            emailext body: 'summary ', subject: 'pipeline status ', to: 'samiradahmane29@gmail.com'
        }
        }
    }
    

