FROM maven:3.6-jdk-8-alpine
WORKDIR /app
COPY pom.xml .
RUN mvn -e -B dependency:resolve
COPY src ./src
RUN mvn -e -B package

FROM openjdk:8-jdk-alpine
RUN addgroup -S deploy && adduser -S deploy -G deploy
USER deploy:deploy
VOLUME /tmp
ADD target/*.jar spring-undertow-metrics-app.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "spring-undertow-metrics-app.jar"]