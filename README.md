# 🚌 Smart Transport Management System

A **Java** console project that applies core **data structures and algorithms** to a transport route management scenario: storing routes, processing passengers in order, undoing actions, and sorting and searching route distances.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Data Structures](https://img.shields.io/badge/Data_Structures-Algorithms-5C2D91?style=for-the-badge)
![OOP](https://img.shields.io/badge/OOP-Object_Oriented-0A9396?style=for-the-badge)

## 📌 Project Overview

Completed for **Unit 19: Data Structures and Algorithms** (Pearson BTEC HND in Computing). A transport company needs to manage routes, serve passengers fairly, and correct mistakes. The project shows how choosing the right data structure for each job keeps the system simple and efficient.

## 🧩 Data Structures and Algorithms Used

| Component | Structure / Algorithm | Purpose | Time complexity |
|---|---|---|---|
| `RouteManager` | **LinkedList** | Store and display routes | Add: O(1), display: O(n) |
| `PassengerQueue` | **Queue (FIFO)** | Serve passengers in arrival order | Add / process: O(1) |
| `UndoStack` | **Stack (LIFO)** | Save and undo the last route action | Push / pop: O(1) |
| `SortRoutes` | **Merge Sort** | Sort route distances | O(n log n) time, O(n) extra space |
| `SearchRoute` | **Linear Search** | Find a distance in an array | O(n) |

## 🗂️ Project Structure

```
src/
├── Main.java            Runs the full demo
├── Route.java           Route details (ID, source, destination, distance)
├── Passenger.java       Passenger details
├── RouteManager.java    LinkedList of routes
├── PassengerQueue.java  FIFO queue of passengers
├── UndoStack.java       Stack for undo
├── SortRoutes.java      Merge Sort
└── SearchRoute.java     Linear Search
```

## ▶️ How to Run

Requires the **Java Development Kit (JDK) 8 or later** (tested with JDK 21).

```
cd src
javac *.java
java Main
```

### Sample output

```
Route added successfully.
Route added successfully.
Route added successfully.
Route saved for undo operation.

Available Routes:
Route ID: 101 | Colombo -> Kandy | Distance: 115 km
Route ID: 102 | Colombo -> Galle | Distance: 120 km
Route ID: 103 | Kandy -> Jaffna | Distance: 315 km
Passenger added to queue.
Passenger added to queue.

Passenger Processing:
Processing passenger: Ali | Destination: Kandy
Processing passenger: Afry | Destination: Galle
Queue is empty. No passenger to process.

Undo Operation:
Undo route ID: 103

Sorted Route Distances:
75 90 115 120 315 

Search Result for 120 km: Index 3
```

## 🧠 Design Highlights

- **Object-oriented design:** each class has one responsibility (routes, passengers, queue, undo, sorting, searching).
- **Right structure for the job:** a queue gives fairness (first come, first served), a stack gives "undo the latest action", and a linked list makes it cheap to add routes.
- **Defensive checks:** the queue and stack handle the empty case with a message instead of crashing, and `Main` catches unexpected errors.

## 📚 Report Analysis

The accompanying report goes beyond the code, covering:

- Abstract Data Types: List, Stack, Queue, Tree, and Set, with their operations
- Memory stack behaviour during function calls
- A **Bubble Sort vs Merge Sort** comparison (theoretical complexity)
- **Shortest-path algorithms** (Dijkstra and Bellman-Ford) for route planning, analysed in theory and not implemented in this code
- An imperative specification of the Stack ADT, plus encapsulation and information hiding

## 🚧 Limitations and Next Steps

- The demo uses **hard-coded data** and has no user menu or input.
- **Undo** records the last route action but does not yet remove the route from the list.
- **Merge Sort** sorts a separate array of distances rather than the route objects themselves.
- Passengers are not yet matched to routes.
- There are no automated tests.
- Next steps: a menu-driven interface, sorting `Route` objects with a comparator, real undo, JUnit tests, and an implementation of Dijkstra's algorithm for shortest routes.

## 📄 Documentation

- [Project presentation (pptx)](docs/smart-transport-presentation.pptx)
- [Report extract (docx)](docs/smart-transport-report-extract.docx)

## 📂 Repository Contents

| File | Description |
|---|---|
| `src/` | Java source code |
| `docs/` | Presentation and report extract |

## 👤 Author

**Afry Nizam**: BSc Information Technology student, University of West London
[LinkedIn](https://www.linkedin.com/in/afrynizam) · [GitHub](https://github.com/afrynizam07)
