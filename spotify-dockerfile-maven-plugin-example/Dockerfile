FROM openjdk:8-jre

ENTRYPOINT ["java", "-jar", "/app.jar"]

ARG JAR_FILE
ADD target/${JAR_FILE} /app.jar