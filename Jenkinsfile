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
        bat 'mvn --version'
      }
    }
  }
}
