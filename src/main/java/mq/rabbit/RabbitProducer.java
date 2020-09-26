package mq.rabbit;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RabbitProducer {

    public static void main(String[] args) throws Exception {
        ConnectionFactory connectionFactory = new ConnectionFactory();

        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        connectionFactory.setHost("localhost");
        connectionFactory.setVirtualHost("/");


        Connection conn = connectionFactory.newConnection();

        Channel channel = conn.createChannel();

        String exchangeName = "hello-exchange";

        channel.exchangeDeclare(exchangeName, "direct", true);

        String routingKey = "testRoutingKey";

        byte[] messageBytes = "quit".getBytes();

        channel.basicPublish(exchangeName, routingKey, null, messageBytes);

        channel.close();

        conn.close();



    }
}
