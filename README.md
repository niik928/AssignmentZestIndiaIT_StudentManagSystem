# AssignmentZestIndiaIT_StudentManagSystem

# Student Management System (Spring Boot + JWT)

## 📌 Project Overview
This is a Student Management System built using Spring Boot, Spring Security, JWT Authentication, and MySQL.

It provides REST APIs for managing students with secure authentication.

---

## 🚀 Features
- User Registration & Login
- JWT Authentication
- Add Student
- Get All Students
- Update Student
- Delete Student
- Global Exception Handling
- Swagger API Documentation

## 🔐 Security
- Passwords are encrypted using BCryptPasswordEncoder
- JWT token is used for API authentication
---

## 🛠 Tech Stack
- Java 17
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- MySQL
- Maven
- Swagger (OpenAPI)

---

## 📂 Project Structure
- Controller → API endpoints
- Service → Business logic
- Repository → Database layer
- Config → Security & JWT
- Exception → Global error handling
- Entity → Database models

---

## 🔐 Authentication Flow
1. Register user → password stored using BCrypt
2. Login → returns JWT token
3. Use token in Swagger/Postman:
   Bearer <token>

---

## 🧪 API Endpoints

### Auth
- POST /api/auth/register
- POST /api/auth/login

### Student
- GET /api/students
- POST /api/students
- PUT /api/students/{id}
- DELETE /api/students/{id}

## 📌 API Documentation
Swagger URL: Swagger URL:
http://localhost:8080/swagger-ui/index.html

## 🛠️ How to Run Project
1. Clone repository
2. Configure MySQL database
3. Run Spring Boot application
4. Open Swagger URL
--
