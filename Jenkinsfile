pipeline {
  agent { label 'macos' }
  // tools {
  //   maven 'maven-3.8.6' 
  // }
  stages {
    stage ('Build') {
      def mvnHome = tool 'M3'
      steps {
        echo 'Running build automation'
        sh 'mvn clean package'
      }
    }
  }
}
