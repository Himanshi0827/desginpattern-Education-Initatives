
## **Overview**

This repository demonstrates various **Design Patterns** across different categories (Behavioral, Creational, and Structural) through several use cases and projects. The patterns were implemented to solve real-world problems such as smart home management, stock market notifications, RPG character creation, and more.

The repository is structured into two main exercises:

- **Exercise 1: Design Patterns**
  - Implement and demonstrate two patterns each from the **Behavioral**, **Creational**, and **Structural** categories.

- **Exercise 2: Mini-Projects**
  - Choose one problem statement and build a terminal-based application that focuses on functional and optional requirements while utilizing the specified design patterns.

---

## **Exercise 1: Design Patterns**

In this exercise, various design patterns are implemented and categorized as **Behavioral**, **Creational**, and **Structural** patterns.

### **1. Behavioral Patterns**

#### **1.1 Observer Pattern (Stock Market Notifications)**

**Use Case: Stock Market Price Notification**
- A stock market platform where multiple investors (observers) are notified whenever a stock price changes. Investors can subscribe and unsubscribe from stock updates.

**Key Components**:
- **StockMarket (Subject)**: Maintains stock prices and notifies all registered investors when prices change.
- **Investor (Observer)**: Gets notified when the price of stocks they follow changes.

**Path**: `DesignPatterns/Behavioral/ObserverPattern.cs`

#### **1.2 Memento Pattern (Modified Stock Market)**

**Use Case: Stock Market Portfolio Management**
- This project expands the stock market by adding the ability for investors to save and restore their portfolios using the Memento pattern, in addition to the real-time notifications from the Observer pattern.

**Key Components**:
- **PortfolioMemento (Memento)**: Stores the state of the investor's portfolio.
- **Investor (Originator)**: Creates and restores their portfolio’s state using the Memento.
- **PortfolioManager (Caretaker)**: Manages the saving and restoring of investor portfolios.

**Path**: `DesignPatterns/Behavioral/MementoPattern.cs`

### **2. Creational Patterns**

#### **2.1 Builder Pattern (RPG Game Character Creation)**

**Use Case: Dynamic RPG Character Creation**
- Build RPG characters dynamically using the Builder pattern. Customize characters by adding skills, weapons, and attributes, with achievements-based evolution.

**Key Components**:
- **CharacterBuilder**: Helps build RPG characters with different attributes.
- **Character**: Represents the final RPG character with custom attributes.
- **GameManager**: Manages in-game achievements and character evolution.

**Path**: `DesignPatterns/Creational/BuilderPattern.cs`

#### **2.2 Factory Pattern (Smart Home Device Management)**

**Use Case: Smart Home Device Management**
- This project uses the Factory pattern to manage smart home services based on user activities. Different services (e.g., `LeavingHomeService`, `MovieTimeService`) are dynamically instantiated to control devices like lights, thermostats, and security systems.

**Key Components**:
- **SmartServiceFactory**: Creates specific services (e.g., `LeavingHomeService`, `MovieTimeService`) based on user activity.
- **SmartHomeService**: Represents the actions performed for different situations in a smart home (e.g., turning off lights, locking doors).

**Path**: `DesignPatterns/Creational/FactoryPattern.cs`

### **3. Structural Patterns**

#### **3.1 Decorator Pattern (Virtual Classroom Manager)**

**Use Case: Virtual Classroom Management**
- Manage classrooms, students, and assignments dynamically by extending functionality with decorators. The classroom system supports creating classrooms, enrolling students, and scheduling assignments.

**Key Components**:
- **ClassroomDecorator**: Dynamically adds functionalities to the classroom system (e.g., student enrollment, assignment submission).
- **ClassroomManager**: Manages virtual classrooms and student records.

**Path**: `DesignPatterns/Structural/DecoratorPattern.cs`

#### **3.2 Adapter Pattern (Payment Gateway Interface)**

**Use Case: Payment Gateway Integration**
- The Adapter pattern is used to integrate a legacy payment system with a modern payment gateway. This allows seamless compatibility between incompatible interfaces.

**Key Components**:
- **OldPaymentSystem**: Legacy payment system with outdated methods.
- **PaymentGatewayAdapter**: Adapts the old payment system to work with the new modern payment gateway interface.
- **IPaymentGateway**: The interface for modern payment systems.

**Path**: `DesignPatterns/Structural/AdapterPattern.cs`

---

## **Exercise 2: Mini-Projects**

### **Real-Time Chat Application**

**Use Case: Real-Time Chat Application with Room Management**
- A terminal-based real-time chat system where users can create or join chat rooms, send messages, and track active users.

**Key Components**:
- **ChatRoomManager (Singleton)**: Manages all active chat rooms.
- **ChatRoom**: Represents a single chat room where users can communicate.
- **User**: Represents the user in the chat room.
- **Observer Pattern**: Notifies users in the room when new messages arrive.
- **Adapter Pattern**: Optional extension to support different communication protocols like WebSocket or HTTP.

**Path**: `MainProgram.cs`

---

## **Conclusion**

This repository demonstrates the power of design patterns in solving various real-world problems. Each pattern was carefully selected to fit the problem's context, focusing on extensibility, scalability, and maintainability. These exercises and mini-projects provide a strong foundation for understanding how different patterns can be applied in software development.
