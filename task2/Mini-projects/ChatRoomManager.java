

import java.util.ArrayList;
import java.util.List;

class ChatRoomManager {
    private static ChatRoomManager instance;
    private List<ChatRoom> chatRooms;

    private ChatRoomManager() {
        chatRooms = new ArrayList<>();
    }

    public static ChatRoomManager getInstance() {
        if (instance == null) {
            instance = new ChatRoomManager();
        }
        return instance;
    }

    public ChatRoom createChatRoom(String roomId) {
        ChatRoom chatRoom = new ChatRoom(roomId);
        chatRooms.add(chatRoom);
        return chatRoom;
    }

    public ChatRoom getChatRoom(String roomId) {
        for (ChatRoom room : chatRooms) {
            if (roomId.equals(room.getRoomId())) {
                return room;
            }
        }
        return null;
    }
}
