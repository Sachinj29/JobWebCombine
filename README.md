# 💼 Job Portal Web Application

A full-stack Job Portal web application that allows job seekers to apply for jobs and employers to post vacancies. Built with a **Spring Boot** backend and a simple yet functional frontend using HTML, CSS, and JavaScript.

---

## 🛠 Tech Stack

| Layer      | Technology                         |
|------------|-------------------------------------|
| Frontend   | HTML, CSS, JavaScript               |
| Backend    | Spring Boot                         |
| Database   | PostgreSQL                          |

---

## 🔍 Features

- 🧑‍💼 User & Employer Registration/Login (Spring Security)
- 📃 Post and Manage Jobs (CRUD)
- 🔍 Search & Apply for Jobs
- 👤 Profile Management
- 📑 RESTful APIs for frontend-backend communication
- 🔒 Secure access using **Spring Security**

---

## 📦 Spring Boot Backend (Core Focus)

### ✅ Key Concepts Used:

- **Spring MVC** – Controller-Service-Repository layered architecture  
- **Spring Data JPA** – ORM-based interaction with PostgreSQL  
- **RESTful APIs** – JSON-based API endpoints for frontend integration  
- **Spring Security** – Authentication and Authorization  

---

## 🧪 Tools Used

| Purpose     | Tool               |
|-------------|--------------------|
| Frontend    | Visual Studio Code |
| Backend     | IntelliJ IDEA      |
| Database    | pgAdmin / CLI      |

---

## 🚀 Running the Application

### 🧑‍💻 Backend (Spring Boot)

1. Open the project in **IntelliJ IDEA**
2. Configure the database credentials in `application.properties`
3. Run the `JobPortalApplication.java` file to start the Spring Boot server

```bash
# Sample application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/Your_DataBase_Name
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
