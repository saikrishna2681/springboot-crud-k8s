pipeline {
  stages{
    stage('checkout') {
      checkout scm
    }
    stage('compile package') {
      def mvnhome = tool name: 'maven-3', type: 'maven'
    }
  }
}
