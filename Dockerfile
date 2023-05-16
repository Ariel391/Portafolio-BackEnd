FROM amazoncorrectto:17-apine-jdk
MAINTAINER Ariel
COPY target/ar-0.0.1-SNAPSHOT.jar ari-app.jar
ENTRYPOINT ["java","-jar","/ari-app.jar"]