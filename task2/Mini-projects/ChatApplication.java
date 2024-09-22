
import java.util.Scanner;

public class ChatApplication {
    public static void main(String[] args) {
        ChatRoomManager manager = ChatRoomManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Chat Application!");
        System.out.print("Enter a room ID to join/create: ");
        String roomId = scanner.nextLine();

        ChatRoom chatRoom = manager.createChatRoom(roomId);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        User user = new User(username);
        chatRoom.addUser(user);

        // Simulate connecting with WebSocket (this can be more complex in a real
        // application)
        CommunicationProtocol protocol = new WebSocketProtocol();
        protocol.connect(roomId);

        String message;
        while (true) {
            System.out.print(username + ": ");
            message = scanner.nextLine();
            if (message.equalsIgnoreCase("exit")) {
                chatRoom.removeUser(user);
                break;
            }
            chatRoom.sendMessage(message, username);
        }

        scanner.close();
        System.out.println("Chat session ended.");
    }
}
