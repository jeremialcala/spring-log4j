pipeline {
  agent {
    docker {
      image 'openjdk:8-jdk-alpine'
    }

  }
  stages {
    stage('Build') {
      steps {
        git(url: 'https://github.com/jeremialcala/spring-log4j.git', branch: 'develop', changelog: true)
      }
    }
  }
}