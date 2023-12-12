FROM openjdk:17

WORKDIR /app

COPY src ./src
COPY .mvn ./.mvn
COPY mvnw pom.xml ./
RUN ./mvnw clean install

CMD ["java","-jar","-Dspring.profiles.active=docker","target/AdymnarScheduleApp-0.0.1-SNAPSHOT.jar"]