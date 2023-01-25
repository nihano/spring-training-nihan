#Baseimage /it has to be in any dockerfile
FROM openjdk:17-jdk
#will get jar file and copy to image
COPY ./target/Spring-24-Docker-0.0.1-SNAPSHOT.jar  /usr/app/
#to  direct any folder
WORKDIR /usr/app

#will provide exacutable application when container starts the run
ENTRYPOINT ["java","-jar","Spring-24-Docker-0.0.1-SNAPSHOT.jar"]

