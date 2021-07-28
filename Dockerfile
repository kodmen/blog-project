FROM openjdk:11-jre-slim-buster

COPY ./blog-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch blog-0.0.1-SNAPSHOT.jar'

ARG JAR_FILE=target/blog-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","blog-0.0.1-SNAPSHOT.jar"]