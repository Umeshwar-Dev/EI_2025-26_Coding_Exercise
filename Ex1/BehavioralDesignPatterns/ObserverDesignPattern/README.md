
# Observer Design Pattern – Blogging 📝

A simple **Java console application** demonstrating the **Observer Design Pattern**.  
A `BlogPublisher` notifies all registered `Followers` whenever a new blog post is published.

---

## 📜 Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Design Pattern Structure](#design-pattern-structure)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Sample Output](#sample-output)


---

## Overview
This project simulates a blogging system:
- **Publisher (Subject)** – publishes blog posts.
- **Followers (Observers)** – automatically receive notifications of new posts.

---

## Features
- Register and unregister followers dynamically.
- Publish new blog posts and notify followers.
- Console-based Java application with clean separation of concerns.

---

## Design Pattern Structure  

```

BlogPublisher (Subject Interface)
├── registerFollower()
├── unregisterFollower()
└── notifyFollowers()

Follower (Observer Interface)
└── update(blogPost)

ConcreteBlogPublisher (Concrete Subject)
├── List<Follower>
├── publishNewPost(post)
└── notifyFollowers()

BlogFollower (Concrete Observer)
└── update(blogPost)

````

---

## Prerequisites
- Java 17+ (or compatible JDK)
- Git (if cloning repository)

---

## Installation
```bash


# Compile the Java files
javac *.java

---

## Usage

```bash
# Run the application
java BlogClient
```

---

## Project Structure

```
Blogging/
 ├── BlogPublisher.java           # Subject interface
 ├── Follower.java                # Observer interface
 ├── ConcreteBlogPublisher.java   # Concrete Subject implementation
 ├── BlogFollower.java            # Concrete Observer implementation
 └── BlogClient.java       # Demo main application
```

---

## Sample Output

```
Blog Publisher: Publishing new post: Observer Pattern in Java Explained
Alice received notification of new blog post: Observer Pattern in Java Explained
Bob received notification of new blog post: Observer Pattern in Java Explained
Charlie received notification of new blog post: Observer Pattern in Java Explained

Blog Publisher: Publishing new post: Understanding Design Patterns with Examples
Alice received notification of new blog post: Understanding Design Patterns with Examples
Charlie received notification of new blog post: Understanding Design Patterns with Examples
```

---
