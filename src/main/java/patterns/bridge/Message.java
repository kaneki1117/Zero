package patterns.bridge;

public abstract class Message {

    private MessageImpl impl;

    public Message(MessageImpl impl) {
        this.impl = impl;
    }

    public void send(String msg){
        this.impl.send(msg);
    }
}
