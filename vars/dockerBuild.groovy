def call(String projectName, String ImageTag, String DockerHubUser ){
  bat 'docker build -t ${DockerHubUSer}/${projectName}:${ImageTag} .'
}
