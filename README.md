# Spring Boot MVC – Employee Management System

## 📌 Project Overview

This project is a simple **Employee Management System** developed using Java and Spring Boot MVC.

It demonstrates how to build a layered Spring Boot application using Controller, Service, Repository, and Model layers.

Spring Data JPA is used to perform database operations such as adding, retrieving, and deleting employee records.

## 🛠️ Technologies Used

- Java 21
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Eclipse IDE

## ✨ Features

### 1. Add Employee
- Adds new employee details into the database.
- Uses the `save()` method from JpaRepository.

### 2. Get All Employees
- Retrieves all employee records from the database.
- Uses the `findAll()` method.

### 3. Delete Employee
- Deletes an employee using Employee ID.
- Uses the `deleteById()` method.

## 📂 Project Structure

```text
SpringBootMVC
│
├── src/main/java
│   └── com.SpringBootMVC
│       │
│       ├── controller
│       │   └── EmployeeController.java
│       │
│       ├── demo
│       │   └── SpringBootMvcApplication.java
│       │
│       ├── model
│       │   └── Employee.java
│       │
│       ├── repo
│       │   └── EmployeeRepository.java
│       │
│       └── service
│           └── EmployeeService.java
│
├── src/main/resources
│
├── src/test/java
│
└── pom.xml
```

## 🏗️ Application Architecture

This project follows a layered architecture.

**1. Controller Layer**
- Handles incoming HTTP requests.
- Communicates with the Service layer.

**2. Service Layer**
- Contains business logic.
- Calls Repository methods to perform database operations.

**3. Repository Layer**
- Communicates with the database.
- Uses Spring Data JPA for CRUD operations.

**4. Model Layer**
- Contains the Employee entity class.
- Represents employee data in the database.

## 📖 Important Spring Data JPA Methods

| Method | Purpose |
|---|---|
| `save()` | Insert or update employee |
| `findAll()` | Retrieve all employees |
| `findById()` | Retrieve employee by ID |
| `deleteById()` | Delete employee by ID |

## ⚙️ How to Run the Project

1. Clone the repository.

```bash
git clone https://github.com/srideviboini123/SpringBootMVC.git
```

2. Import the project into Eclipse IDE.

3. Configure database properties in `application.properties`.

4. Make sure MySQL is running.

5. Update Maven dependencies.

6. Run `SpringBootMvcApplication.java` as a Spring Boot App.

## 🎯 Learning Outcomes

Through this project, I learned:

- Spring Boot application structure.
- Spring MVC architecture.
- Dependency Injection using `@Autowired`.
- Separation of concerns using layered architecture.
- Spring Data JPA repository methods.
- Basic Employee CRUD operations.
- Communication between Controller, Service, and Repository layers.



**Developed by:** Sridevi Boini

**Role:** Java Full Stack Developer | Fresher
