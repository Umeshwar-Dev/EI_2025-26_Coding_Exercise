# EI_2025-26 Coding Exercises

This repository contains solutions to the EI_2025-26 coding exercises implemented in **Java** using various design patterns.  
Each exercise demonstrates a different category of design patterns and best practices.

---

## 📚 Exercise 1 – Design Patterns

### 🟢 Behavioural Design Patterns
1. **Observer Design Pattern** – Blogging Application  
   *Implements the Observer pattern to notify subscribers when new blog posts are published.*

2. **Strategy Design Pattern** – Authentication App  
   *Implements the Strategy pattern to support multiple authentication methods (e.g., password, OAuth, Biometric).*

### 🟣 Creational Design Patterns
1. **Abstract Factory Method Design Pattern** – Lays Chips Manufacturing Unit  
   *Implements the Abstract Factory pattern to create families of chip flavours and packaging styles.*

2. **Builder Method Design Pattern** – Travel Package Planner  
   *Implements the Builder pattern to construct complex travel packages step by step (flights, hotels, car rentals and tour plans).*

### 🟡 Structural Design Patterns
1. **Facade Method Design Pattern** – Swiggy Food Delivery  
   *Implements the Facade pattern to simplify interactions with multiple subsystems (restaurants, menus, food delivery partner and client).*

2. **Proxy Method Design Pattern** – Remote File Download System  
   *Implements the Proxy pattern to control and optimise access to remote file downloads.*

---

## 🖥 Exercise 2 – Programming Exercise

### Problem Statement: **Virtual Classroom Manager**
A **terminal-based backend application** for managing virtual classrooms, students, and assignments.  
Implements the **Command Pattern** and follows SOLID principles with packages for commands, models, validation, and exceptions.

Key features:
- Add and list classrooms
- Enrol students into classrooms
- Schedule and submit assignments
- Input validation and logging

Refer to the [Virtual Classroom Manager section](#) for details and usage instructions.

---

## 📝 How to Use
- Each pattern/example has its own folder.
- Open the desired folder and run `javac` to compile followed by `java` to execute.
- The Virtual Classroom Manager can be run from its main class:
  ```bash
  java VirtualClassroomManager
