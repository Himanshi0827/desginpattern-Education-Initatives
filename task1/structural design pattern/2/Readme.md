# Virtual Classroom Manager

## Project Overview
The **Virtual Classroom Manager** is a terminal-based application designed to manage virtual classrooms. The system allows users to create classrooms, enroll students, schedule assignments, and manage submissions. The focus is on classroom management, with features such as tracking attendance and managing assignments.

## Features
- **Classroom Management:** Create, list, and remove virtual classrooms.
- **Student Management:** Enroll students into classrooms and list students in a class.
- **Assignment Management:** Schedule assignments for classrooms and submit them.

## Design Patterns
- **Decorator Pattern:** Used to dynamically add features such as managing classrooms, students, and assignments.
- **Command Pattern (Optional):** Can be used to extend the functionality by handling commands like adding classrooms, enrolling students, etc.

## How to Run
1. Compile the Java code:
    ```bash
    javac ClassroomManager.java
    ```
2. Run the application:
    ```bash
    java ClassroomManager
    ```

## Key Components
- **ClassroomManager:** Manages the creation and deletion of classrooms.
- **Classroom:** Represents a single virtual classroom.
- **Student:** Represents a student enrolled in a classroom.
- **Assignment:** Represents an assignment scheduled for a classroom.
