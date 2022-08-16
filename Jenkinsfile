pipeline {
  agent { label 'main' }
  tools {
    maven 'M3' 
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
