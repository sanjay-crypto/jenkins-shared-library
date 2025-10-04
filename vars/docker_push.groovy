def call (String Project, String ImageTag, String dockerHubUser) {
   withCredentials([usernamePassword(
      credentialsId:'docker_hub_creds', 
      passwordVariable:'dockerHubPass', 
      usernameVariable:'dockerHubUser')]) {
       sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
   }
    //sh "docker image tag ${Project}:${ImageTag} ${dockerHubUser}/${Project}:${ImageTag}"
    sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
