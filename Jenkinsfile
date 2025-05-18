pipeline {
    
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven"
    }
// SCM checkout
// build
//Deploy WAR
// Email
    stages {
        stage("SCM checkout") {
            steps {
                
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/SidRaghib786/HotelManagement.git']])
            }
        }
        stage("Build Process") {
             steps{
                 script{
                     bat 'mvn clean install -DskipTests'
                 }
             }
        }
        stage("Deploy to Container") {
             steps{
                 deploy adapters: [tomcat9(alternativeDeploymentContext: '', credentialsId: 'Tomcat-pwd', path: '', url: 'http://localhost:3333/')], contextPath: '/HotelManagementJenkinsDemo', war: '**/*.war'
             }
        }
        }
    }

