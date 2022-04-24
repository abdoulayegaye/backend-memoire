FROM openjdk:16-alpine3.13 as PROD
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src
#CREATE ENV
ARG DB_HOST=${DB_HOST}
ARG DB_USER=${DB_USER}
ARG DB_PASSWORD=${DB_PASSWORD}
ARG DB_NAME=${DB_NAME}
ARG SERVER_PORT=${SERVER_PORT}
#BUILD APP: GENERATE JAR
RUN ./mvnw package

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar","api-memoire.jar"]