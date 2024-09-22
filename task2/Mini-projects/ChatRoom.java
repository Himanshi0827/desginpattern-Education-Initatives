
import java.util.ArrayList;
import java.util.List;

class ChatRoom implements Subject {
    private List<Observer> observers;
    private String roomId;
    private List<String> messages;
    private List<String> activeUsers;

    public ChatRoom(String roomId) {
        this.roomId = roomId;
        this.observers = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.activeUsers = new ArrayList<>();
    }

    public void addUser(Observer observer) {
        observers.add(observer);
        activeUsers.add(observer.toString());
        notifyObservers(observer.toString() + " has joined the room.");
        displayActiveUsers();
    }

    public void removeUser(Observer observer) {
        observers.remove(observer);
        activeUsers.remove(observer.toString());
        notifyObservers(observer.toString() + " has left the room.");
        displayActiveUsers();
    }

    public void sendMessage(String message, String username) {
        messages.add(username + ": " + message);
        notifyObservers(username + ": " + message);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public List<String> getActiveUsers() {
        return activeUsers;
    }

    private void displayActiveUsers() {
        System.out.println("Active Users: " + activeUsers);
    }

    public String getRoomId() {
        return roomId;
    }
}
