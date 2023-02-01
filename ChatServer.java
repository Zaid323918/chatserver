import java.util.ArrayList;

public class ChatServer {

    ArrayList<Chatter> chatters;
    int chatterCount = 0; //tracks of number of chatters in the server so that server can close once all chatters leave

    public ChatServer() {
        chatters = new ArrayList<>();
    }

    public void addChatter(Chatter chatterName) {
        chatters.add(chatterName);
    }

    public void displayMsg(String msg) {
        for (Chatter i: chatters) {
            i.msgToWindow(msg);
        }
    }

    public void start() {

        while(chatters.size() > chatterCount) {
            chatterCount = 0;
            for (Chatter i: chatters) {
                if (i.chattermsg != null) {
                    displayMsg(i.sendMsg());
                }
                chatterCount += i.window.chatterLeft;
            }
        }
        System.exit(0);
    }
}
