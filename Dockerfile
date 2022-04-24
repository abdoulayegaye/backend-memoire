FROM openjdk:16-alpine3.13 as PROD
USER root
RUN mkdir /web
COPY .mvn/ /web/.mvn
COPY mvnw pom.xml /web/
RUN /web/mvnw dependency:go-offline
COPY src /web/src/
#CREATE ENV
ARG JAR_FILE=/web/target/api-memoire.jar
ARG DB_HOST=${DB_HOST}
ARG DB_USER=${DB_USER}
ARG DB_PASSWORD=${DB_PASSWORD}
ARG DB_NAME=${DB_NAME}
ARG SERVER_PORT=${SERVER_PORT}
#BUILD APP: GENERATE JAR
RUN /web/mvnw package
#COPY
COPY ${JAR_FILE} /web/app.jar
WORKDIR /web
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar","/web/api-memoire.jar"]