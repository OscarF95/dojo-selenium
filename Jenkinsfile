pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {
                withMaven(maven : 'maven_3_5_4') {
                    sh 'mvn test'
                }
            }
        }

        stage ('Testing Stage') {
            steps {
                withMaven(maven : 'maven_3_5_4') {
                    sh 'mvn -Dtest=TestHomePageFactory test'
                }
            }
        }
    }
}