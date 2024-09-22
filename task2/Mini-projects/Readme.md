### **ChatApplication**

#### **Project Overview**
The **ChatApplication** is a real-time chat system that enables users to join or create chat rooms, send/receive messages, and track active users in each room. The application utilizes several design patterns to enhance scalability and maintainability, focusing on real-time communication and flexibility with different protocols.

#### **Features**
1. **Create/Join Chat Rooms:** Users can create or join chat rooms by specifying a unique room ID.
2. **Real-Time Messaging:** Messages can be sent and received within chat rooms in real-time.
3. **Active User Tracking:** Display a list of active users in each chat room.
4. **Private Messaging (Optional):** Allows private messages between specific users.
5. **Message History (Optional):** Stores chat history, allowing it to persist when users leave and rejoin the chat.

#### **Design Patterns**
1. **Observer Pattern:** Used to notify all clients in a chat room when a new message or user activity occurs.
2. **Singleton Pattern:** Ensures only one instance of `ChatRoomManager`, which manages all the active chat rooms and their users.
3. **Adapter Pattern:** Allows the system to work with different communication protocols like WebSocket, HTTP, etc., using a standardized interface.

#### **How to Run**
1. Compile the Java code:
    ```bash
    javac ChatApplication.java
    ```
2. Run the application:
    ```bash
    java ChatApplication
    ```

#### **Key Components**
- **ChatRoomManager:** Manages chat rooms and tracks active users.
- **ChatRoom:** Represents a single chat room where users communicate.
- **User:** Represents a user in the chat application.
- **CommunicationProtocol:** Interface for communication protocols (WebSocket, HTTP).
- **WebSocketProtocol:** Example implementation of real-time communication using WebSocket.
- **Message:** Represents a chat message.

