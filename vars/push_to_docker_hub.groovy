def call (String credentialsId, String Project, String ImageTag) {
   withCredentials([usernamePassword('credentialsId':${credentialsId}, passwordVariable:"dockerHubPass", usernameVariable:"dockerHubUser")]) {
       sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
   }
    //sh "docker image tag ${Project}:${ImageTag} ${env.dockerHubUser}/${Project}:${ImageTag}"
    sh "docker push ${env.dockerHubUser}/${Project}:${ImageTag}"
}
