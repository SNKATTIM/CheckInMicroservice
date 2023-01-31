FROM openjdk:11
EXPOSE 8090
ADD target/CheckInMicroservice-0.0.1-SNAPSHOT CheckInMicroservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/CheckInMicroservice-0.0.1-SNAPSHOT.jar"]
