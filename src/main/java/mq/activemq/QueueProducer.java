package mq.activemq;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class QueueProducer {

    public static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
    public static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    public static final String BROKER_URL = ActiveMQConnection.DEFAULT_BROKER_URL;


    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(USERNAME, PASSWORD, BROKER_URL);
        try {

            Connection conn = connectionFactory.createConnection();
            conn.start();

            Session session = conn.createSession(true, Session.AUTO_ACKNOWLEDGE);

            Queue myTestQueue = session.createQueue("activemq-test-1");

            MessageProducer messageProducer = session.createProducer(myTestQueue);

            TextMessage message = session.createTextMessage("test point-to-point msg22");

            messageProducer.send(message);
            session.commit();
            session.close();

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }
}
