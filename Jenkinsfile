pipeline {
  agent { label 'macos' }
  tools {
    maven 'maven-3.8.6' 
  }
  stages {
    stage ('Build') {
      steps {
        echo 'Running build automation'
        sh 'mvn clean package'
      }
    }
  }
}
