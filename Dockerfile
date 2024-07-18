FROM openjdk:17
MAINTAINER "shanthi"
COPY target/Day1App1SB1-1-0.0.1-SNAPSHOT.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Day1App1SB1-1-0.0.1-SNAPSHOT.jar"]



