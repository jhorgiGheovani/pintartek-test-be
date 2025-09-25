FROM maven:3.9.5-eclipse-temurin-17-alpine as builder

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:resolve

COPY src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]