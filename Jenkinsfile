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
  stage('docker push') {
    sh 'docker login -u 2681 -p Karthikeya@1'
    sh 'docker tag springapp 2681/springapp:latest'
    sh 'docker push 2681/springapp:latest'
  }

  stage('push_to_Artifactory') {
    def server = Artifactory.server 'Artifactory'
    url: 'http://http://3.87.51.27:8082/', username: 'admin', password: 'Sai@2681'
    def uploadSpec = 
    """
    {
    "files": [
        {
            "pattern": "*/target/*.jar",
            "target": "test"
        }
      ]
    }"""
    server.upload(uploadSpec)
  }
  
}
