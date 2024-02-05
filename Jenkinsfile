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
        sh 'maven-3 --version'
      }
    }
  }
}
