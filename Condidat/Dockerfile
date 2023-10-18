FROM openjdk:17
EXPOSE 8089
ADD target/docker-sts.jar.jar docker-sts.jar.jar
ENTRYPOINT ["java", "-jar", "docker-sts.jar.jar"]