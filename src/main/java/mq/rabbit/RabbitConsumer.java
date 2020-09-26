package mq.rabbit;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitConsumer {


    public static void main(String[] args) throws Exception{
        ConnectionFactory connectionFactory = new ConnectionFactory();

        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        connectionFactory.setHost("localhost");
        connectionFactory.setVirtualHost("/");

        Connection conn = connectionFactory.newConnection();

        final Channel channel = conn.createChannel();

        String exchangeName = "hello-exchange";
        channel.exchangeDeclare(exchangeName, "direct", true);

        String queueName = channel.queueDeclare().getQueue();
        String routingKey = "testRoutingKey";

        channel.queueBind(queueName, exchangeName, routingKey);

        while (true) {
            boolean autoAck = false;
            String consumerTag = "";

            channel.basicConsume(queueName, autoAck, consumerTag, new DefaultConsumer(channel) {

                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String routingKey = envelope.getRoutingKey();
                    String contentType = properties.getContentType();
                    System.out.println("routingkey: " + routingKey +" contentType: " + contentType);

                    long deliveryTag = envelope.getDeliveryTag();

                    channel.basicAck(deliveryTag, false);
                    System.out.println("body: "  + new String(body, "UTF-8"));

                }

            });
        }


    }
}
