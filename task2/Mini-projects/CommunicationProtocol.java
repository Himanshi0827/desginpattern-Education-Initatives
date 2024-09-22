
interface CommunicationProtocol {
    void connect(String roomId);

    void sendMessage(String message);
}

class WebSocketProtocol implements CommunicationProtocol {
    @Override
    public void connect(String roomId) {
        System.out.println("Connected to room: " + roomId + " via WebSocket.");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via WebSocket: " + message);
    }
}
