# 💼 Job Portal Web Application

![React](https://img.shields.io/badge/React-18-61DAFB?style=for-the-badge&logo=react&logoColor=black)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6.x-6DB33F?style=for-the-badge&logo=spring-security&logoColor=white)
![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-336791?style=for-the-badge&logo=postgresql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-4.0.0-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

---

A **full-stack Job Portal web application** that connects job seekers with employers. This project features a robust **Spring Boot backend** handling business logic and a dynamic **React frontend** for a seamless, responsive user experience.

---

## ✨ Key Features

-   **👤 Dual User Roles**: Separate registration and login flows for **Job Seekers** and **Employers**.
-   **🔐 Secure Authentication**: Built with **Spring Security** to protect user data and manage access control.
-   **📄 Job Management**: Employers can **Create, Read, Update, and Delete** job listings through a dedicated dashboard.
-   **🔍 Advanced Search**: Job seekers can search for jobs using filters and apply with ease.
-   **👨‍💼 User Profiles**: Personalized dashboards for users to track their applications and manage their profiles.
-   **🔄 RESTful Communication**: A clean, well-defined REST API facilitates communication between the frontend and backend.

---

## 🛠️ Tech Stack & Architecture

This project is built using a modern technology stack, ensuring scalability and maintainability.

| Layer | Technology | Description |
| :--- | :--- | :--- |
| 🖥️ **Frontend** | React, HTML5, CSS3 | A modern, component-based UI for a responsive user experience. |
| ⚙️ **Backend** | Spring Boot, Spring MVC | A robust backend using a layered architecture (Controller-Service-Repository). |
| 🗃️ **Database** | PostgreSQL | A powerful, open-source object-relational database system. |
| 🔒 **Security** | Spring Security | Handles authentication, authorization, and role-based access control. |
| 📦 **ORM** | Spring Data JPA / Hibernate | Simplifies database interactions and object-relational mapping. |

---

## 🚀 Getting Started

Follow these instructions to get the project up and running on your local machine.

### ✅ Prerequisites

-   Java (JDK 17 or later)
-   Node.js and npm
-   PostgreSQL
-   An IDE (like IntelliJ IDEA or VS Code)
-   Maven

### ⚙️ Backend Setup (Spring Boot)

1.  **Clone the repository:**
    ```
    git clone <your-repo-url>
    ```

2.  **Configure the database:**
    -   Create a new database in PostgreSQL.
    -   Open the project in IntelliJ IDEA.
    -   Update the `src/main/resources/application.properties` file with your PostgreSQL credentials.

    ```
    # application.properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/your_db_name
    spring.datasource.username=your_postgres_username
    spring.datasource.password=your_postgres_password
    
    # Hibernate settings
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    
    # Server port
    server.port=8080
    ```

3.  **Run the application:**
    -   Let Maven download all the required dependencies.
    -   Find the `JobPortalApplication.java` file and run it.
    -   The backend server will start on `http://localhost:8080`.

### 🎨 Frontend Setup (React)

1.  **Navigate to the frontend directory:**
    ```
    cd frontend-directory-name
    ```

2.  **Install dependencies:**
    ```
    npm install
    ```

3.  **Start the development server:**
    ```
    npm start
    ```

4.  **Open your browser:**
    -   The React application will be available at `http://localhost:3000`.

---

## 🧰 Tools Used

| Purpose | Tool |
| :--- | :--- |
| **Backend IDE** | IntelliJ IDEA |
| **Frontend IDE** | Visual Studio Code |
| **Database Management**| pgAdmin or DBeaver |
| **API Testing** | Postman or Insomnia |
