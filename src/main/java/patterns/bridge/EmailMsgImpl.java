package patterns.bridge;

public class EmailMsgImpl implements MessageImpl{


    public void send(String msg) {
        System.out.println("email send");
    }
}
