node {
  stage('checkout') {
    checkout scm
  }
  stage('compile package') {
    def mvnhome = tool name: 'maven-3', type: 'maven'
    sh "${mvnhome}/bin/mvn package -DskipTests"
  }
  stage('docker build') {
    sh 'docker build -t springapp .'
  }
}
