FROM amazoncorrectto:17-alpine-jdk
MAINTAINER Ariel
COPY target/ar-0.0.1-SNAPSHOT.jar ar-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ar-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080 