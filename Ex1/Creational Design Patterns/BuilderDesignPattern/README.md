
# 🧳 Travel Package Planner – Builder Design Pattern

A simple Java console application demonstrating the **Builder Design Pattern**.  
It builds customizable travel packages (Budget & Luxury) by separating the **construction** of a package from its **representation**.

---

## 📜 Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Design Pattern Used](#design-pattern-used)
- [Class Diagram](#class-diagram)
- [Prerequisites](#prerequisites)
- [Installation & Execution](#installation--execution)
- [Code Structure](#code-structure)
- [Sample Output](#sample-output)
- [License](#license)

---

## Overview
This project demonstrates how to use the **Builder Pattern** in Java to construct complex objects step by step.

It allows you to create two types of travel packages:
- **Budget Travel Package**
- **Luxury Travel Package**

---

## Features
- Create **Budget** or **Luxury** travel packages.
- Each package includes:
  - Flight details
  - Hotel details
  - Car rental information
  - Tours included
- Clear separation between **construction process** and **final product**.
- Easy to extend (e.g., adding new package types).

---

## Design Pattern Used
- **Builder Design Pattern**  
  - **Product**: `TravelPackage` (the final object)  
  - **Builder Interface**: `TravelPackageBuilder`  
  - **Concrete Builders**: `BudgetTravelPackageBuilder`, `LuxuryTravelPackageBuilder`  
  - **Director**: `TravelPackageDirector`  
  - **Client**: `TravelPackageClient` (demonstrates usage)

This pattern helps build different representations of an object using the same construction process.

---


## Prerequisites
- Java 17+ (or compatible JDK)
- A terminal/IDE to run Java programs

---

## Installation & Execution
```bash
# Compile in TravelPackagePlanner Folder
javac *.java

# Run
java TravelPackageClient
````

---

## Code Structure

```
TravelPackageClient.java        # Main client file
TravelPackage.java              # Product class
TravelPackageBuilder.java       # Builder interface
BudgetTravelPackageBuilder.java # Concrete builder for budget package
LuxuryTravelPackageBuilder.java # Concrete builder for luxury package
TravelPackageDirector.java      # Director class orchestrating build process
```

---

## Sample Output

```
Budget Travel Package:
Travel Package Details:
Flight: Economy flight with basic amenities
Hotel: 3-star budget hotel
Car Rental: Economy car rental
Tours Included:
 - City walking tour
 - Museum visit

Luxury Travel Package:
Travel Package Details:
Flight: Business class flight with lounge access
Hotel: 5-star luxury resort
Car Rental: Luxury sedan rental
Tours Included:
 - Private guided city tour
 - Helicopter sightseeing
 - Gourmet dining experience
```

---

