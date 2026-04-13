FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
# Use a wildcard to ensure we grab the generated JAR
COPY target/app.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
