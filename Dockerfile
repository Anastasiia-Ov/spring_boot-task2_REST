FROM openjdk:21
EXPOSE 8080
COPY target/rest-0.0.1-SNAPSHOT.jar authorizationApp.jar
CMD ["java", "-jar", "authorizationApp.jar"]