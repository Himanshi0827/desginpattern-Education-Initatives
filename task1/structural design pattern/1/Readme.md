# Payment Gateway Interface Project

## Overview
This project demonstrates the implementation of the Adapter design pattern in a payment processing system. It showcases how to integrate an old payment system with a new payment gateway interface, allowing for seamless interaction between incompatible interfaces.

## Design Pattern: Adapter
The Adapter pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate. In this project, we use the Adapter pattern to make an old payment system work with a new payment gateway interface.

### Key Components:
1. **IPaymentGateway (Target Interface)**: Defines the interface that the client code expects to work with.
2. **OldPaymentSystem (Adaptee)**: Represents the existing system with an incompatible interface.
3. **OldPaymentAdapter (Adapter)**: Implements the IPaymentGateway interface and wraps an instance of OldPaymentSystem, adapting calls between the new and old interfaces.
4. **ModernPaymentSystem**: A concrete implementation of IPaymentGateway, representing a modern payment system.

## Project Structure
```
src/
├── IPaymentGateway.java
├── OldPaymentSystem.java
├── OldPaymentAdapter.java
├── ModernPaymentSystem.java
└── PaymentDemo.java
```

## Logic and Implementation Details

### IPaymentGateway Interface
- Defines the contract for modern payment systems.
- Methods:
  - `processPayment(double amount)`: Processes a payment of the given amount.
  - `getTransactionDetails()`: Retrieves details of the transaction.

### OldPaymentSystem
- Represents a legacy payment system with incompatible method names and signatures.
- Methods:
  - `makePayment(float amount)`: Processes a payment (note the use of `float` instead of `double`).
  - `getPaymentInfo()`: Retrieves payment information.

### OldPaymentAdapter
- Implements `IPaymentGateway` and wraps an `OldPaymentSystem` instance.
- Adapts calls from the new interface to the old system:
  - `processPayment(double amount)` calls `oldSystem.makePayment((float) amount)`.
  - `getTransactionDetails()` calls `oldSystem.getPaymentInfo()`.

### ModernPaymentSystem
- A concrete implementation of `IPaymentGateway`.
- Directly implements the modern interface methods.

### PaymentDemo
- Demonstrates the usage of both modern and adapted old payment systems.
- Uses a common method to process payments, showcasing the interchangeability achieved through the Adapter pattern.

## Key Benefits
1. **Interoperability**: Allows the old payment system to work alongside modern systems without modifying its code.
2. **Flexibility**: New payment systems can be easily integrated by implementing the `IPaymentGateway` interface.
3. **Separation of Concerns**: The adapter encapsulates all the logic necessary for interface translation.
4. **Open/Closed Principle**: The system is open for extension (new payment systems) but closed for modification of existing code.

## Usage
To run the demonstration:
1. Compile all Java files.
2. Run the `PaymentDemo` class.

```bash
javac *.java
java PaymentDemo
```

## Extension Points
- Add more concrete implementations of `IPaymentGateway` for different payment providers.
- Extend the `OldPaymentAdapter` to handle more complex translations if needed.
- Implement error handling and logging in the adapter for robust integration.

## Conclusion
This project demonstrates how the Adapter pattern can be effectively used to integrate legacy systems with new interfaces, providing a flexible and maintainable solution for payment processing systems.
