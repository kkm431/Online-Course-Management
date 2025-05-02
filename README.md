# 🎓 SOLID-Based Online Course Management System

This is a Spring Boot-based backend application demonstrating the **SOLID principles** using a real-world use case of an Online Course Management System. It is structured with proper layered architecture and follows industry best practices.

---

## 📌 Tech Stack

- **Backend Framework**: Spring Boot
- **Database**: MySQL (or H2 for in-memory testing)
- **Testing**: Postman (API testing), JUnit (unit testing)
- **ORM**: Spring Data JPA
- **Build Tool**: Maven

---

## 🧠 SOLID Principles & Their Application

### ✅ SOLID Principles Mapped to Classes

| **SOLID Principle**           | **Meaning**                                                                    | **Applied In / Class(es)**                                                                                                        |
| ----------------------------- | ------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------- |
| **S - Single Responsibility** | A class should have only one reason to change                                  | `CourseService`, `UserService`, `PaymentService`, `NotificationService` each handles only one responsibility                      |
| **O - Open/Closed**           | Open for extension, closed for modification                                    | `Payment` interface and its implementations (`CreditCardPayment`, `PayPalPayment`, etc.)                                          |
|                               |                                                                                | `Notification` interface and its implementations (`EmailNotification`, `SMSNotification`, etc.)                                   |
| **L - Liskov Substitution**   | Subtypes must be substitutable for their base types                            | `Student` and `Admin` extend `User`; both can be used wherever `User` is expected                                                 |
| **I - Interface Segregation** | Clients should not be forced to depend on unused methods                       | `Notification` and `Payment` interfaces are minimal and focused; each client depends only on what it uses                         |
| **D - Dependency Inversion**  | High-level modules should depend on abstractions, not concrete implementations | `PaymentService` depends on `Payment` interface, not concrete types <br>`NotificationService` depends on `Notification` interface |

---

### 🔍 Class-Level Mapping to SOLID Principles

| **Class**                 | **Principles Applied** |
| ------------------------- | ---------------------- |
| `CourseService`           | SRP                    |
| `UserService`             | SRP                    |
| `PaymentService`          | SRP, DIP               |
| `NotificationService`     | SRP, DIP               |
| `Payment` interface       | OCP, ISP, DIP          |
| `Notification` interface  | OCP, ISP, DIP          |
| `CreditCardPayment`, etc. | OCP, LSP               |
| `EmailNotification`, etc. | OCP, LSP               |
| `Student`, `Admin`        | LSP                    |

---

## 🏗️ Project Architecture

| Layer             | Responsibilities                                                  |
|------------------|--------------------------------------------------------------------|
| **Controller**    | Exposes REST APIs                                                 |
| **Service**       | Business logic (follows SRP)                                      |
| **Repository**    | DB operations using Spring Data JPA                               |
| **Entity**        | Domain models (`Course`, `User`, `Payment`, etc.)                 |
| **Interface**     | Abstractions for DIP & ISP (`Payment`, `Notification`, etc.)      |
| **Strategy**      | Implements strategies (OCP) for payment methods                   |
| **Notification**  | Notification strategies (Email, SMS) extend the `Notification` interface |

---

## 📂 Directory Structure

```

src/
├── controller/
│   ├── CourseController.java
│   ├── PaymentController.java
│   └── UserController.java
├── service/
│   ├── CourseService.java
│   ├── PaymentService.java
│   ├── userService.java
│   └── NotificationService.java
├── repository/
│   ├── UserRepository.java
│   └── CourseRepository.java
├── model/
│   ├── Course.java
│   ├── Admin.java
│   ├── Student.java
│   └── User.java
├── payment/
│   ├── Payment.java
│   ├── CreditCardPayment.java
│   └── PayPalPayment.java
├── notification/
│   ├── EmailNotification.java
│   └── Notification.java
└── Application.java

````

---

##  Sample Features

-  Add a new course
-  Register a user
-  Make a payment using different strategies (Card, UPI)
-  Send notifications via Email or SMS
-  View course and user info

---

##  How to Run the Project

1. **Clone the Repository**
```bash
git clone https://github.com/kkm431/online-course-management.git
cd online-course-management
````

2. **Run MySQL or Use H2 (Optional for local DB)**

3. **Update `application.properties`**

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/solid_course_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

4. **Run the App**

```bash
./mvnw spring-boot:run
```

5. **Test APIs with Postman**

* Base URL: `http://localhost:8080/api/courses`
* Sample APIs: Create Course, Make Payment, Register User

---

## Documentation

*  Clean Architecture
*  Interface-Driven Design
*  Highly testable and modular codebase
*  Demonstrates real-world SOLID principles

---

## Future Enhancements

* Add OAuth2-based authentication
* Use Docker for containerization

---

## Authors

* **Ketan Kumar Mishra**
