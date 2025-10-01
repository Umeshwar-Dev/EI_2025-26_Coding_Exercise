
# 🍽️ Food Delivery Facade Pattern Demo

A concise Java example demonstrating the **Facade Design Pattern** with a food delivery scenario. The `Swiggy` class acts as a facade, simplifying access to menus from various cuisine restaurants.

---

## Table of Contents

- [Introduction](#introduction)
- [Design Pattern](#design-pattern)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Example Output](#example-output)
- [Files](#files)

---

## Introduction

This project provides a straightforward illustration of the Facade pattern. Clients interact with the `Swiggy` class to access Indian, Italian, and Chinese menus, without managing each restaurant subsystem directly[files:3].

---

## Design Pattern

- **Facade Role:** The `Swiggy` class exposes high-level methods to get cuisine-specific menus.
- **Subsystem:** Each cuisine (Indian, Italian, Chinese) has its own restaurant and menu class implementing shared interfaces for uniformity.

---

## Project Structure

```
Client.java
Swiggy.java          <-- Facade
FoodDelivery.java    <-- Facade Interface
Hotel.java           <-- Restaurant Interface
IndianMenu.java      <-- Menu Implementation
ItalianMenu.java     <-- Menu Implementation
ChineseMenu.java     <-- Menu Implementation
IndianRestaurant.java <-- Restaurant Implementation
ItalianRestaurant.java <-- Restaurant Implementation
ChineseRestaurant.java <-- Restaurant Implementation
Menus.java           <-- Menu Interface
```

- `Client` interacts only with `Swiggy`.
- `Swiggy` uses internal references to deliver menus using the unified methods.

---

## Usage

1. **Compile all files:**
   ```
   javac *.java
   ```
2. **Run the demo:**
   ```
   java Client
   ```

---

## Example Output

```
Chinese Menu : Noodles, Fried Rice, Manchurian
Indian Menu : Paneer, Butter Naan, Biryani
Italian Menu : Pizza, Pasta, Lasagna
```
---

## Files

| File                  | Description                          |
|-----------------------|--------------------------------------|
| Client.java           | Demo entrypoint[files:1]             |
| Swiggy.java           | Facade class[files:3]                |
| FoodDelivery.java     | Facade interface[files:11]           |
| Hotel.java            | Restaurant interface[files:7]        |
| Menus.java            | Menu interface[files:2]              |
| IndianMenu.java       | Indian menu[files:5]                 |
| ItalianMenu.java      | Italian menu[files:4]                |
| ChineseMenu.java      | Chinese menu[files:6]                |
| IndianRestaurant.java | Indian restaurant impl[files:10]      |
| ItalianRestaurant.java| Italian restaurant impl[files:9]      |
| ChineseRestaurant.java| Chinese restaurant impl[files:8]      |

---

