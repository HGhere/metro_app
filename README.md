# Delhi Metro Route Finder (JavaFX)

A Java-based desktop application that computes the shortest route between Delhi Metro stations using graph data structures and Dijkstra’s algorithm.

⚠️ This is **not an Android application**. It is a Java desktop application built using **JavaFX**.

---

## Features
- Graph-based modeling of Delhi Metro stations and routes
- Shortest path calculation using Dijkstra’s algorithm
- Distance-based fare calculation
- JavaFX GUI for interactive source and destination selection
- Edge case handling:
  - Same source and destination
  - Unreachable routes
  - Invalid user input

---

## Technologies Used
- Java
- JavaFX
- Graph Data Structures
- Dijkstra’s Algorithm
- Priority Queue

---

## Project Structure
src/
├── Graph.java
├── MetroMap.java
├── Dijkstra.java
└── MetroFX.java


---

## How It Works
- Each metro station is modeled as a **node**
- Each connection between stations is a **weighted edge**
- Dijkstra’s algorithm is used to compute the shortest path
- The GUI interacts with the routing logic without mixing concerns

---

## How to Run
1. Install **JDK 17+**
2. Download **JavaFX SDK**
3. Compile and run:
```bash
javac --module-path /path/to/javafx/lib --add-modules javafx.controls -d out src/*.java
java --module-path /path/to/javafx/lib --add-modules javafx.controls -cp out MetroFX


## Author
Harshit Garg
