def call(String projectName, String ImageTag, String DockerHubUser ){
  //bat 'docker build -t ${DockerHubUSer}/${projectName}:${ImageTag} .'
  bat "docker build -t ${DockerHubUser}/${projectName}:${ImageTag} ."
}
