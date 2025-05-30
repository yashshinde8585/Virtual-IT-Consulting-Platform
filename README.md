# Virtual IT Consulting Company (OOP Learning Project)

This project simulates a **Virtual IT Consulting Company** to provide a practical environment for understanding and applying the core **Object-Oriented Programming (OOP)** concepts in Java. The goal is to master **Abstraction**, **Encapsulation**, **Inheritance**, and **Polymorphism** through hands-on implementation in a real-world inspired scenario.

---

## 🧐 Why This Project?

Learning OOP concepts theoretically can be abstract and difficult to grasp. This project brings these concepts to life by modeling a simple IT consulting business where clients, employees, projects, and services interact naturally. It enables learning by doing, which solidifies understanding and prepares you for real software development.

---
## 📁 Project Structure

```plaintext
Virtual-IT-Consulting-Platform/
└── src/
    ├── main/
    │   └── VirtualITConsultingApp.java
    └── model/
        ├── Person.java
        ├── Client.java
        ├── Employee.java
        ├── Developer.java
        ├── Analyst.java
        ├── Manager.java
        ├── Service.java
        ├── CloudService.java
        ├── WebDevService.java
        ├── Project.java
        ├── Meeting.java
        ├── ClientMeeting.java
        └── TeamMeeting.java
```
---

## 📚 OOP Concepts Explained & Implemented

### 1. **Abstraction**

- **What?** Hides complex implementation details and shows only necessary features.
- **Why?** Simplifies interaction with objects by focusing on what they do, not how they do it.
- **In this project:**  
  The `Service` interface abstracts the concept of IT services (like CloudService or WebDevService). Clients and projects only interact with the abstract idea of a service without worrying about internal details.

### 2. **Encapsulation**

- **What?** Bundles data (fields) and methods that operate on the data into one unit/class, restricting direct access to some components.
- **Why?** Protects object integrity by preventing external code from directly modifying fields; enforces controlled access via getters/setters.
- **In this project:**  
  All classes have private fields with public getter and setter methods, ensuring controlled access to their data.

### 3. **Inheritance**

- **What?** Mechanism where one class inherits the fields and methods of another.
- **Why?** Promotes code reuse and establishes a natural hierarchy between classes.
- **In this project:**
    - `Employee` inherits from `Person`.
    - Specialized employee types (`Developer`, `Analyst`, `Manager`) inherit from `Employee`.
    - Meeting types (`ClientMeeting` and `TeamMeeting`) inherit from `Meeting`.

### 4. **Polymorphism**

- **What?** Ability of objects to take many forms, typically via method overriding and interface implementation.
- **Why?** Enables flexible and extensible code by allowing methods to behave differently based on the actual object type at runtime.
- **In this project:**
    - Method overriding is used in subclasses like `Developer` and `Manager` to provide specific implementations of methods like `work()`.
    - The `Service` interface is implemented differently by `CloudService` and `WebDevService`, allowing services to vary behavior while sharing a common interface.
    - Method overloading demonstrates multiple methods with the same name but different parameters within classes.

### 5. **Composition**

- **What?** Objects contain other objects, modeling a "has-a" relationship.
- **Why?** Builds complex types from simpler ones, enhancing modularity and reusability.
- **In this project:**
    - `Project` has a `Client` and a list of `Employee`s working on it.
    - `Meeting` maintains a list of participants.

---

## 🏗️ How to Compile & Run

1️⃣ Open terminal/command prompt and navigate to the project folder:

2️⃣ Compile the project (starting with the main file):

3️⃣ Run the program:

---
## Acknowledgments

- This project’s core idea, structure, and purpose were envisioned by me as a learning tool to master **Object-Oriented Programming (OOP) concepts**.
- The implementation and code examples were created with the assistance of ChatGPT, tailored to align with my goal of **learning and practicing all OOP principles in a real-world scenario**.
