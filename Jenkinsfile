pipeline {
  agent { label 'main' }
  tools {
    maven 'maven-3.8.6' 
  }
  stages {
    stage ('Build') {
      steps {
        withMaven {
          sh "mvn package -DskipTests"
          sh "mvn deploy -DskipTests"
        }
      }
    }
  }
}
