package patterns.bridge;

public class CommonMsg extends Message {

    public CommonMsg(MessageImpl impl) {
        super(impl);
    }

    public void send(String msg){
        super.send(msg);
    }
}
