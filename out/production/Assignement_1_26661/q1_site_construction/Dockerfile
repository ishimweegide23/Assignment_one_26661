FROM openjdk:21-jdk-slim

WORKDIR /app

# Copy all source files maintaining package structure
COPY *.java ./q1_site_construction/

# Compile with package awareness
RUN javac q1_site_construction/*.java

# Run with full package qualification
CMD ["java", "q1_site_construction.SiteConstructionApp"]