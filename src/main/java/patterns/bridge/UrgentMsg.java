package patterns.bridge;

public class UrgentMsg extends Message {

    public UrgentMsg(MessageImpl impl) {
        super(impl);
    }

    public void send(String msg){
        super.send(msg);
    }

    public String watch(){
        return null;
    }
}
