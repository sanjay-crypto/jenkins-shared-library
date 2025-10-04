def call (String credentialsId, String Project, String ImageTag) {
   withCredentials([usernamePassword(credentialsId:'credentialsId', passwordVariable:'dockerHubPass', usernameVariable:dockerHubUser')]) {
       sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
   }
    //sh "docker image tag ${Project}:${ImageTag} ${dockerHubUser}/${Project}:${ImageTag}"
    sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
