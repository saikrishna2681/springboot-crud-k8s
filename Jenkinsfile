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
        bat 'maven-3 --version'
      }
    }
  }
}
