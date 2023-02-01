public class Main {

    public static void main(String[] args) {

        ChatServer server1 = new ChatServer();
        Chatter steve = new Chatter("Steve");
        server1.addChatter(steve);
        Chatter david = new Chatter("David");
        server1.addChatter(david);
        Chatter jake = new Chatter("Jake");
        server1.addChatter(jake);
        server1.start();

        ChatServer server2 = new ChatServer();
        Chatter john = new Chatter("John");
        server2.addChatter(john);
        Chatter chris = new Chatter("Chris");
        server2.addChatter(chris);
        server2.start();
    }
}