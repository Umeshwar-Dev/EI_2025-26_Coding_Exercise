
# Strategy Design Pattern – Authentication App 🔐

A simple **Java console application** demonstrating the **Strategy Design Pattern**.  
It allows you to authenticate users using different authentication strategies (Password, OAuth, Biometric) at runtime.

---

## 📜 Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Design Pattern Structure](#design-pattern-structure)
- [Prerequisites](#prerequisites)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Sample Output](#sample-output)

---

## Overview
This project simulates an authentication system:
- **Strategies** – Different authentication mechanisms (Password, OAuth, Biometric).
- **Context** – Chooses which strategy to apply at runtime.

It cleanly separates the **algorithm (authentication)** from the **context (app)**, following the Strategy Design Pattern.

---

## Features
- Switch authentication strategies at runtime.
- Supports Password, OAuth, and Biometric authentication.
- Console-based Java application with clean separation of concerns.

---

## Design Pattern Structure  

```

AuthenticationStrategy (Strategy Interface)
└── authenticate()

PasswordAuthentication (Concrete Strategy)
└── authenticate()

OAuthAuthentication (Concrete Strategy)
└── authenticate()

BiometricAuthentication (Concrete Strategy)
└── authenticate()

AuthenticationContext (Context Class)
├── setStrategy(AuthenticationStrategy strategy)
└── authenticateUser()

````

---

## Prerequisites
- Java 17+ (or compatible JDK)
- Git (if cloning repository)

---



## Usage

```bash
# Compile the Java files
javac *.java

# Run the application
java Client
```

---

## Project Structure

```
AuthenticationApp/
 ├── AuthenticationStrategy.java       # Strategy interface
 ├── PasswordAuthentication.java       # Concrete Strategy – Password
 ├── OAuthAuthentication.java          # Concrete Strategy – OAuth
 ├── BiometricAuthentication.java      # Concrete Strategy – Biometric
 ├── AuthenticationContext.java        # Context class
 └── Client.java   # Demo main application
```

---

## Sample Output

```
Password Auth success?
Authenticating using Password for user

OAuth Auth success?
Authenticating using OAuth for user

Biometric Auth success?
Authenticating using Biometrics for user
```

---


