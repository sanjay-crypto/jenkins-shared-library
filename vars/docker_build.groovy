def call(String ProjectName, String ImageTag, String DockerHubUser) {
  echo "Building the app"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
