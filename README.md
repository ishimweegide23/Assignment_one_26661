# 💻 Assignment One – Object Oriented Programming (OOP)
**👤 Student**: Ishimwe Egide  
**🆔 ID**: 2666
**📚 Subject**: Object Oriented Programming – Assignment One  

---

## 📦 Introduction

This repository contains three object-oriented Java programs solving different real-world problems. Each question is:
- Implemented using clean OOP principles (Abstraction, Inheritance, Encapsulation, Polymorphism)
- Dockerized for easy testing and deployment
- Pushed to Docker Hub for public access

---

## 🧱 Project Structure
```
Assignment_one_26661/
└── src/
├── q1_site_construction/
├── q2_hotel_management/
└── q3_traffic_fines/

```

### Each folder contains:
- Java files for that question
- A `Dockerfile`
- Docker image building and deployment instructions

---

# 🛠️ How to Run Projects (with Docker)

Make sure:
- Docker is installed on your system
- Docker is running
- You have internet for pushing images to Docker Hub

---

# 🏗️ Q1: Site Construction Management System

### 📌 Description  
Helps calculate construction material costs using inheritance and abstract classes.

📂 Location: `src/q1_site_construction`  
📝 Main Class: `SiteConstructionApp.java`  

---

### 📄 Dockerfile

```dockerfile
FROM openjdk:21-jdk-slim
WORKDIR /app
COPY *.java ./q1_site_construction/
RUN javac q1_site_construction/*.java
CMD ["java", "q1_site_construction.SiteConstructionApp"]
```

## 🐳 Docker Commands

🔹 Step 1: Go to the Project Folder

```bash
cd src/q1_site_construction
```
➡️ This moves you to the folder that contains the Java files and Dockerfile.

## 🛠️ Step 2: Build the Docker Image
```bash

docker build -t oop_26661_q1_site_construction .
```

## 🏗️ This tells Docker to:

Use the Dockerfile in this folder
````
Create an image called oop_26661_q1_site_construction

````

## 🏷️ Step 3: Tag the Image for Docker Hub
```bash

docker tag oop_26661_q1_site_construction kwibuka/assignment_one_26661:q1_site_construction
```

🔖 This assigns a Docker Hub-friendly name to your image so you can push it online.

### ☁️ Step 4: Push to Docker Hub
```
docker push kwibuka/assignment_one_26661:q1_site_construction
```
▶️ Step 5: Run the Docker Container
```bash
docker run -it --rm kwibuka/assignment_one_26661:q1_site_construction
```
🚀 This runs your project in a container.

-it: interactive terminal

--rm: delete container after exit

The program executes and exits


# 🏨 Q2: Hotel Management System
## 📌 Description
Manages room booking, customer details, and billing.

- 📂 Location: src/q2_hotel_management
- 📝 Main Class: HotelManagementApp.java

## 📄 Dockerfile

```dockerfile
FROM openjdk:21-jdk-slim
WORKDIR /app
COPY *.java ./q2_hotel_management/
RUN javac q2_hotel_management/*.java
CMD ["java", "q2_hotel_management.HotelManagementApp"]
```

## 🐳 Docker Commands
### 🔹 Step 1: Go to the Folder
```
cd src/q2_hotel_management
```

# 🛠️ Step 2: Build the Image
```bash
docker build -t oop_26661_q2_hotel_management .

```
# 🏷️ Step 3: Tag the Image

```bash

docker tag oop_26661_q2_hotel_management kwibuka/assignment_one_26661:q2_hotel_management
```
# ☁️ Step 4: Push to Docker Hub
```bash
docker push kwibuka/assignment_one_26661:q2_hotel_management
```
## ▶️ Step 5: Run the App
```bash
docker run -it --rm kwibuka/assignment_one_26661:q2_hotel_management
```


# 🚦 Q3: Traffic Fines Management System
## 📌 Description
Records violations, calculates fines, and manages reporting.

- 📂 Location: src/q3_traffic_fines
- 📝 Main Class: TrafficFineApp.java

## 📄 Dockerfile
```dockerfile

FROM openjdk:21-jdk-slim
WORKDIR /app
COPY *.java ./q3_traffic_fines/
RUN javac q3_traffic_fines/*.java
CMD ["java", "q3_traffic_fines.TrafficFineApp"]
```
## 🐳 Docker Commands
### 🔹 Step 1: Go to Folder
```bash
cd src/q3_traffic_fines
```
🛠️ Step 2: Build the Image
```bash
docker build -t oop_26661_q3_traffic_fines .
```
🏷️ Step 3: Tag the Image
```bash
docker tag oop_26661_q3_traffic_fines kwibuka/assignment_one_26661:q3_traffic_fines
```
☁️ Step 4: Push to Docker Hub
```bash
docker push kwibuka/assignment_one_26661:q3_traffic_fines
```
▶️ Step 5: Run the App
```bash
docker run -it --rm kwibuka/assignment_one_26661:q3_traffic_fines
```
## 📂 Docker Hub Repository

🧩 All images are publicly available at:  
🔗 **[kwibuka/assignment_one_26661](https://hub.docker.com/repository/docker/kwibuka/assignment_one_26661)**
