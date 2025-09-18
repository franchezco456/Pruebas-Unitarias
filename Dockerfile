FROM maven:3.8.6-openjdk-17

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean test

Comando por defecto
CMD ["mvn", "clean", "test"]