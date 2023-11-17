node {
  stage('checkout') {
    
    git 'https://github.com/saikrishna2681/springboot-crud-k8s'
  }
  stage('compile package') {
    def mvnhome = tool name: 'maven-3' type: 'maven'
    sh "${mvnhome}/bin/mvn package"
  }
}
