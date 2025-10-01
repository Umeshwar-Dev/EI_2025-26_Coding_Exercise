
# Abstract Factory Design Pattern – Lays Chips Manufacturing Unit 🍟

A simple **Java console application** demonstrating the **Abstract Factory Design Pattern**.  
It simulates a **Lays Chips Manufacturing Unit**, where different factories produce chips of various **flavors** and **packaging types**.

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
This project models a **Lays Chips Manufacturing Unit** using the **Abstract Factory Pattern**:
- **Abstract Factories** create families of related products (chips flavor + packaging type).
- **Concrete Factories** represent actual production units.
- **Client** interacts with factories without knowing their internal details.

It demonstrates how to encapsulate a group of individual factories to maintain consistency across related products.

---

## Features
- Produces multiple **flavors** (Classic, Spicy, Cream & Onion, etc.).
- Supports different **packaging types** (Yellow, Red, etc.).
- Clean separation of concerns between flavor creation and packaging.
- Follows the **Abstract Factory Pattern** strictly.

---

## Design Pattern Structure  

```

ChipsFactory (Abstract Factory)
├── createFlavor()
└── createPackaging()

Flavor (Abstract Product)
├── taste()

Packaging (Abstract Product)
├── packType()

ClassicLaysFactory / SpicyLaysFactory (Concrete Factories)
├── createFlavor()
└── createPackaging()

ClassicFlavor / SpicyFlavor  (Concrete Products – Flavors)
ClassicPackaging / SpicyPackaging (Concrete Products – Packaging)

LaysManufacturingUnit (Demo Class)
└── uses ChipsFactory to produce chips and packaging

````

---

## Prerequisites
- Java 17+ (or compatible JDK)
- Git (if cloning repository)

---


## Usage

```bash
cd LaysManufacturingUnit

# Compile all Java files
javac *.java
# Run the main client application
java LaysManufacturingUnit
```

---

## Project Structure

```
LaysManufacturingUnit/
 ├── Flavor.java                   # Abstract Product – Flavor
 ├── Packaging.java                # Abstract Product – Packaging
 ├── ClassicFlavor.java            # Concrete Product – Classic Flavor
 ├── ClassicPackaging.java         # Concrete Product – Classic Packaging(Yellow)
 ├── LaysFactory.java              # Abstract Factory interface
 ├── ClassicLaysFactory.java       # Concrete Factory – Classic Chips
 ├── SpicyFlavor.java              # Concrete Product – Spicy Flavor
 ├── SpicyPackaging.java           # Concrete Product – Spicy Packaging(Red)
 ├── SpicyLaysFactory.java         # Concrete Factory – Spicy Chips     
 └── LaysManufacturingUnit.java    # Client / Demo class
```

---

## Sample Output

```
Producing Classic Lays:
Flavor: Classic salted taste
Packaging: Yellow Colour Packaging

Producing Spicy Lays:
Flavor: Spanish Tomato Tango flavor
Packaging: Red Colour Packaging

---


