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
        }
      }
    }
    stage ('Deploy') {
      steps {
        sh 'sed -i "s/NEXUS_IP/$NEXUS_HOST/g" "pom.xml"'
        withMaven {
          sh "mvn deploy -DskipTests"
        }
      }
    }
  }
}
