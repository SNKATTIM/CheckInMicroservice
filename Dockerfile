FROM openjdk:11
EXPOSE 8090
ADD target/*.jar app1.jar
ENTRYPOINT ["java", "-jar","/app1.jar"]
