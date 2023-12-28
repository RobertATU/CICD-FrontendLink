FROM openjdk:17.0.1

WORKDIR /app

COPY target/CICD-Frontend-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "CICD-Frontend-0.0.1-SNAPSHOT.jar","--spring.profiles.active=docker"]