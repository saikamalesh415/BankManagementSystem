# Stage 1 — build with Maven
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app

# Copy just the files needed to build (helps cache)
COPY pom.xml .
COPY .mvn .mvn
COPY mvnw mvnw
RUN mvn -v

# Now copy source and build
COPY src ./src
RUN mvn -B -DskipTests package

# Stage 2 — run with a small JRE
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY --from=build /app/target/*.jar app.jar

# Expose port (Spring Boot uses server.port from env)
EXPOSE 8081

ENTRYPOINT ["java","-jar","/app.jar"]
