# sampleacr

**DockerfileName :** Dockerfile (no extension)
while saving in notepad++ , please select extension as all.

Commands :

**Build springboot application :** mvn clean package -Dmaven.skip.test=true


**build docker image :** docker build -t <imageName> <dockerfilelocation>
  
  
**List Docker image :** docker images


**remove docker image :** docker image rm <imageid>
  
  
**run docker image :** docker run -p <port>:<port> <imageName> --name <containerName>
  
  
**list docker containers :** docker ps -a


**start docker container : ** docker start <containerid>
  
  
**stop docker container :** docker stop <containerid>

**Azure docker container registries login :**

docker login <acr_server_url>

docker tag <local_docker_image> <acr_server_url>/<imageName>
  
docker push <acr_server_url>/<imageName>
