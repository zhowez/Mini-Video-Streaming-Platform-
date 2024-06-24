FROM openjdk:22-jdk-slim
VOLUME /tmp
ADD target/Spring-Boot-App-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
