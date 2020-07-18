package mq.example;

public class ConsumeClient {

    public static void main(String[] args) throws Exception {
        MqClient client = new MqClient();
        String consume = client.consume();
        System.out.println(consume);
    }
}
