FROM maven:3.9.6-eclipse-temurin-17

# Set working directory
WORKDIR /app

# Copy entire project
COPY . .

# Download dependencies first (better cache)
RUN mvn -q dependency:resolve

# Run tests
CMD ["mvn", "clean", "test"]
FROM ubuntu:latest
LABEL authors="RamyaHegde"

ENTRYPOINT ["top", "-b"]