pipeline {
  agent any
  stages{
    stage('checkout') {
      steps{
        checkout scm
      }
    }
    stage('compile package') {
      steps{
        def mvnhome = tool name: 'maven-3', type: 'maven'
        bat "${mvnhome}/bin/mvn install -DskipTests"
      }
    }
  }
}
