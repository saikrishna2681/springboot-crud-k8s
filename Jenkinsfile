node {
  stage('checkout') {
    checkout scm
  }
  stage('compile package') {
    def mvnhome = tool name: 'maven-3', type: 'maven'
    sh "${mvnhome}/bin/mvn install -DskipTests"
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
    def server = Artifactory.server 'test1'
    def uploadSpec = 
    """
    {
    "files": [
        {
            "pattern": "*/target/*.jar",
            "target": "test/test/"
        }
      ]
    }"""
    server.upload(uploadSpec)
  }
  
}
