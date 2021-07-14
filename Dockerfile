FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/secexample-1.0.jar app.jar
CMD ["java", "-jar", "/app.jar"]