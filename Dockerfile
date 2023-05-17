FROM amazoncorrectto:17
MAINTAINER Ariel
COPY target/ar-0.0.1-SNAPSHOT.jar ar-app.jar
ENTRYPOINT ["java","-jar","/ar-app.jar"]
EXPOSE 8080