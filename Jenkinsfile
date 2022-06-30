pipeline {
  agent { label 'macos' }
  // tools {
  //   maven 'maven-3.8.6' 
  // }
  stages {
    stage ('Build') {
      steps {
        mvnHome = tool 'M3'
        echo 'Running build automation'
        sh "${mvnHome}/bin/mvn clean package"
      }
    }
  }
}
