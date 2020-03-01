FROM maven:3.6.3-jdk-11-openj9

WORKDIR /app
COPY src /app
COPY pom.xml /app

RUN mvn clean package

CMD ["java", "-jar", "target/hello-java-1.0-SNAPSHOT.jar", "com.mycompany.app.App"]
