FROM openjdk:8

COPY ./target/spring-boot-app-in-docker-0.0.2-SNAPSHOT.jar /usr/src/app/

WORKDIR /usr/src/app

EXPOSE 8801

CMD ["java", "-jar", "spring-boot-app-in-docker-0.0.2-SNAPSHOT.jar"]
