FROM openjdk:8

ADD target/mspr.recycl-1.0.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
