FROM openjdk:8-jdk-alpine

COPY app.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "/app.jar"]