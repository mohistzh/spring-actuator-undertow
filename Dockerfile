FROM openjdk:8-jdk-alpine
RUN addgroup -S deploy && adduser -S deploy -G deploy
USER deploy:deploy
VOLUME /tmp
ADD target/*.jar application.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "application.jar"]