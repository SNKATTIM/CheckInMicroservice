FROM openjdk:11
EXPOSE 8090
ADD target/*.jar check.jar
ENTRYPOINT ["java", "-jar","/check.jar"]
