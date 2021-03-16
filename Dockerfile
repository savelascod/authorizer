FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} authorizer.jar
ENTRYPOINT ["java","-jar","/authorizer.jar"]

FROM gradle:6.8.3-jdk8-openj9 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle clean build --no-daemon

FROM openjdk:8-jre-slim

EXPOSE 8080

RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/*.jar /app/authorizer.jar

ENTRYPOINT ["java","-jar","/app/authorizer.jar"]