FROM openjdk:21-jdk-slim

WORKDIR /app

# Copy all source files maintaining package structure
COPY *.java ./q2_hotel_management/

# Compile with package awareness
RUN javac q2_hotel_management/*.java

# Run with full package qualification
CMD ["java", "q2_hotel_management.HotelManagementApp"]


