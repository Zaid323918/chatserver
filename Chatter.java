import java.util.ArrayList;

public class Chatter {

    public String chatterName;
    public String chattermsg;
    public ChatWindow window;

    public Chatter(String chatterName) {
        this.chatterName = chatterName;
        window = new ChatWindow(this);
    }

    public void modifyMsg(String msg) {
        chattermsg = chatterName + ": " + msg + "\n";
    }

    public String sendMsg(){
        String temp = chattermsg;
        chattermsg = null;
        return temp;
    }

    public void msgToWindow(String msg) {
        window.addMsg(msg);
    }
}