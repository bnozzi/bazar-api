FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar bazar-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/bazar-0.0.1-SNAPSHOT.jar"]
