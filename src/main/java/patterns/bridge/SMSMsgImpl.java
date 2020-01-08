package patterns.bridge;

public class SMSMsgImpl implements MessageImpl {

    public void send(String msg) {
        System.out.println("sms send");
    }
}
