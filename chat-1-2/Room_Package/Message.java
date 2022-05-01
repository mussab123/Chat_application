package Room_Package;
import java.io.Serializable;

public class Message implements Serializable {

    private String communicator;
    private int communicatorId;
    private int chatId;
    private String message;

    public Message(String sender, int senderId, int roomId, String message) {

        this.communicator = sender;
        this.communicatorId = senderId;
        this.message = message;
        this.chatId = roomId;
    }


    public Message(String sender, int senderId, String text) {
        this.communicator = sender;
        this.communicatorId = senderId;
        this.message = text;
        this.chatId = 0;
    }

    public String communicator() { return this.communicator;}

    public String message() { return this.message;}

    public int communicatorId() { return this.communicatorId; }

    public int chatId() { return  this.chatId; }

    public String chatString() { return this.communicator + "," + this.communicatorId + "," +

            this.chatId + "," + this.message + "\n";
    }

    public static Message outfromchat(String s) {
        String[] splitted = s.split(",");
        return new Message(splitted[0], Integer.parseInt(splitted[1]), Integer.parseInt(splitted[2]), splitted[3]);
    }

    public String toString(){
        return this.communicator+"("+this.communicatorId+"): "+this.message;
    }
}
