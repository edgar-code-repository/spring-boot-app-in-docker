FROM java:8-jdk-alpine

COPY ./target/spring-boot-app-in-docker-0.0.1-SNAPSHOT.jar /usr/src/app/

WORKDIR /usr/src/app

EXPOSE 8801

CMD ["java", "-jar", "spring-boot-app-in-docker-0.0.1-SNAPSHOT.jar"]
