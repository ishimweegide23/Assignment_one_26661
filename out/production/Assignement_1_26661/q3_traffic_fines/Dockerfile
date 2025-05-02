FROM openjdk:21-jdk-slim

WORKDIR /app

# Copy all Java files while keeping directory structure
COPY *.java ./q3_traffic_fines/

# Compile with package awareness
RUN javac q3_traffic_fines/*.java

# Run the main class using the full package name
CMD ["java", "q3_traffic_fines.TrafficFineApp"]
