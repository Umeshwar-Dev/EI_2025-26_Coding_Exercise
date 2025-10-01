# Virtual Classroom Manager 🎓

A **terminal-based backend application** for an EdTech platform.
It allows you to manage virtual classrooms, students, and assignments from the command line.
Built using **Java** with a clean architecture and design patterns (**Command Design Pattern**, **SOLID**).

---

## 📜 Table of Contents

* [Overview](#overview)
* [Features](#features)
* [Architecture & Design Patterns](#architecture--design-patterns)
* [Prerequisites](#prerequisites)
* [Installation](#installation)
* [Usage](#usage)
* [Available Commands](#available-commands)
* [Project Structure](#project-structure)
* [Logging & Error Handling](#logging--error-handling)



---

## Overview

The **Virtual Classroom Manager** simulates the backend of a virtual classroom system.

It manages:

* Classrooms
* Student enrollments
* Scheduling and submission of assignments

The application runs entirely in a **terminal (CLI)** and focuses on:

* **Logic**
* **Code quality**
* **Maintainability**
* **Design patterns**

---

## Features

* **Classroom Management**
  Add, list, and remove virtual classrooms.
* **Student Management**
  Enroll students into classrooms and list students per class.
* **Assignment Management**
  Schedule assignments for classes and submit assignments per student.
* **Command Pattern Implementation**
  Each user command is encapsulated as a command object.
* **Logging**
  All actions and errors are logged to console.
* **Validation & Exceptions**
  Input validation and custom exceptions ensure robust error handling.

---

## Architecture & Design Patterns

* **Command Pattern** – Each user input (`ADD_CLASSROOM`, `ADD_STUDENT`, etc.) maps to a command class.
* **SOLID Principles** – Code is modular, open for extension, and closed for modification.
* **Separation of Concerns** – Distinct packages for commands, models, validation, and exceptions.

---

## Prerequisites

* Java 17+ (or compatible JDK)
* Git

---

## Installation

```bash
# Clone the repository
git clone https://github.com/Umeshwar-Dev/EI_2025-26_Coding_Exercise/Ex2/VirtualClassroomManager.git
cd VirtualClassroomManager

# Compile all Java sources
javac *.java commands\*.java models\*.java validation\*.java exceptions\*.java

```

---

## Usage

```bash
# Run the application
java VirtualClassroomManager
```

You’ll see a prompt like:

```
====================================================
    Welcome to Virtual Classroom Manager
====================================================
Initial State:
Number of Classrooms: 0
Number of Students: 0
Number of Assignments: 0

Type 'HELP' for available commands.
====================================================

Virtual Classroom Manager>
```

---

## Available Commands

| Command                                                | Description                      |
| ------------------------------------------------------ | -------------------------------- |
| `ADD_CLASSROOM <name>`                                 | Create a new classroom           |
| `ADD_STUDENT <id> <classroom>`                         | Enroll a student in a classroom  |
| `SCHEDULE_ASSIGNMENT <classroom> <details>`            | Schedule assignment for a class  |
| `SUBMIT_ASSIGNMENT <student_id> <classroom> <details>` | Submit assignment for a student  |
| `LIST_CLASSROOMS`                                      | Show all classrooms              |
| `LIST_STUDENTS <classroom>`                            | Show students in a classroom     |
| `LIST_ASSIGNMENTS <classroom>`                         | Show assignments for a classroom |
| `HELP`                                                 | Show available commands          |
| `EXIT`                                                 | Exit application                 |

---

## Project Structure

```
VirtualClassroomManager/
│
├── VirtualClassroomManager.java # Main CLI entry point
└── ClassroomSystem.java   
├── commands/                      # Command classes (AddClassroomCommand, AddStudentCommand, etc.)
├── models/                        # Core domain classes (Classroom, Assignment)
├── validation/                    # Input validator
├── exceptions/                    # Custom exceptions (ValidationException, ClassroomException,etc.)

```

---

## Logging & Error Handling

* Uses `java.util.logging.Logger` for logging.
* Input validation via `validation` package.
* Custom exceptions handle specific error cases gracefully.
