pipeline {
  agent { label 'macos' }
  // tools {
  //   maven 'maven-3.8.6' 
  // }
  stages {
    stage ('Build') {
      def mvn_version = 'M3'
      withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
        echo 'Running build automation'
        sh "${mvnHome}/bin/mvn clean package"
      }
    }
  }
}
