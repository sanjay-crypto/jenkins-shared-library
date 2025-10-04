def call(String image) {
  echo "Building the app"
  sh "whoami"
  sh "docker build -t ${image} ."
}
