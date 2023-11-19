node {
  stage('checkout') {
    checkout scm
  }

  stage ('Static code check') {
    //SOnar qube analysis
  }
  
  stage('compile package') {
    def mvnhome = tool name: 'maven-3', type: 'maven'
    sh "${mvnhome}/bin/mvn install -DskipTests"
  }

  stage('push_to_Artifactory') {
    def server = Artifactory.server 'test1'
    def uploadSpec = 
    """
    {
    "files": [
        {
            "pattern": "*.jar",
            "target": "example-repo-local/"
        }
      ]
    }"""
    server.upload(uploadSpec)
  }

  stage("Dynamic code analysis") {
    //Jacoco report
  }
  
  stage('docker build') {
    sh 'docker build -t springapp .'
  }
  stage('docker push') {
    sh 'docker login -u 2681 -p Karthikeya@1'
    sh 'docker tag springapp 2681/springapp:latest'
    sh 'docker push 2681/springapp:latest'
  }

  
  
}
