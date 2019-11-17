pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''mvn clean package
'''
      }
    }
    stage('test & deploy  ') {
      steps {
        sh 'mvn fabric8:deploy'
      }
    }
    stage('QA') {
      steps {
        sh 'oc tag ms-cart/carts:latest  ms-cart/carts:promoteToQA '
      }
    }
  }
}