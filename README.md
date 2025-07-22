# 💼 Job Portal Web Application

A full-stack Job Portal web application that enables job seekers to apply for jobs and employers to post vacancies. It is built with a **robust Spring Boot backend** and a **modern React frontend**, providing a seamless and responsive user experience.

---

## 🛠 Tech Stack

| Layer      | Technology                         |
|------------|-------------------------------------|
| Frontend   | React, HTML, CSS, JavaScript        |
| Backend    | Spring Boot                         |
| Database   | PostgreSQL                          |

---

## 🔍 Features

- 🧑‍💼 User & Employer Registration/Login (Spring Security)
- 📃 Post, Update, and Delete Job Listings (CRUD)
- 🔍 Search and Apply for Jobs
- 👤 Profile Dashboard for Users
- 📑 RESTful API communication between frontend and backend
- 🔒 Secure Authentication & Authorization with **Spring Security**

---

## 📦 Spring Boot Backend (Core Focus)

### ✅ Key Concepts Implemented:

- **Spring MVC** – Structured Controller-Service-Repository architecture  
- **Spring Data JPA** – ORM with PostgreSQL for smooth data handling  
- **RESTful API** – JSON-based endpoints for frontend communication  
- **Spring Security** – Role-based access, login & signup protection  

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
2. Set up your PostgreSQL database and update credentials in `application.properties`
3. Run the main class: `JobPortalApplication.java`

```properties
# application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
