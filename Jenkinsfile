pipeline {
  agent { label 'macos' }
  // tools {
  //   maven 'maven-3.8.6' 
  // }
  stages {
    stage ('Build') {
      steps {
        withMaven {
          sh "mvn clean verify"
        }
      }
    }
  }
}
