package mq.example;

public class ProducerClient {

    public static void main(String[] args) throws Exception {
        MqClient client = new MqClient();
        client.produce("Hello world");
        client.produce("Hello");
        client.produce("world");
    }
}
