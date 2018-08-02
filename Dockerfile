FROM openjdk:8-jdk as builder
WORKDIR /app

COPY .mvn/ .mvn/
COPY mvnw .
COPY pom.xml .
RUN ./mvnw dependency:go-offline

COPY src/ src/
RUN ./mvnw package


FROM openjdk:8-jre-alpine
VOLUME /tmp
COPY --from=builder /app/target/GeekNightApp-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
