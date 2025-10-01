
# 🗄️ Remote File Proxy Pattern Demo

A simple Java project to illustrate the **Proxy Design Pattern** by simulating remote file access with caching optimization.

---

## Table of Contents

- [Overview](#overview)
- [UML Diagram](#uml-diagram)
- [Project Structure](#project-structure)
- [How It Works](#how-it-works)
- [Running the Example](#running-the-example)
- [Example Output](#example-output)


---

## Overview

This project showcases the Proxy Design Pattern by wrapping a `RemoteFileProxy` around `RealRemoteFile` objects to add caching and optimize remote file requests. The client (user) interacts with files through the proxy, which hides the complexity of retrieving and caching remote files[files:21][files:23].

---

## UML Diagram

```
       +--------------------+
       | RemoteFileSystem   | <-- Client
       +--------------------+
                |
          creates/uses
                |
       +--------------------+
       |  RemoteFileProxy   | <-- Proxy
       +--------------------+
                |
         delegates, caches
                |
       +--------------------+
       |  RealRemoteFile    | <-- Real Subject
       +--------------------+
                |
       +--------------------+
       |   RemoteFile       | <-- Interface
       +--------------------+
```

---

## Project Structure

| File/Class          | Description                                           |
|---------------------|------------------------------------------------------|
| RemoteFileSystem.java | Main client loop to interactively access files[files:22]. |
| RemoteFileProxy.java  | Proxy class; caches files, delegates to real file[files:21]. |
| RealRemoteFile.java   | Simulates retrieval and display of remote file[files:23]. |
| RemoteFile.java       | Interface; unified file access contract[files:24]. |

---

## How It Works

- The client requests files through the `RemoteFileProxy`.
- The proxy checks if the requested file exists in its cache:
  - If present: returns the cached object, saving remote server calls.
  - If not present: fetches the file from the remote server, caches it, then returns it.
- `RealRemoteFile` simulates a time-consuming operation when accessing remote files, representing network delay.

---

## Running the Example

1. **Compile all Java files**
    ```
    javac *.java
    ```

2. **Run the main class**
    ```
    java RemoteFileSystem
    ```

---

## Example Output

```
Remote File System Simulator
filename to access or exit to quit: report.pdf
Downloading report.pdf from remote server...
Download complete!
Displaying file report.pdf

filename to access or exit to quit: report.pdf
Retrieving report.pdf from cache...
Displaying file report.pdf

filename to access or exit to quit: exit
Exiting Remote File System Simulator. Goodbye!
```

---
