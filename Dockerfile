FROM openjdk:11.0.14-jdk-slim-bullseye
WORKDIR /opt
ADD target/catalog-*.jar catalog.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/catalog.jar"]
