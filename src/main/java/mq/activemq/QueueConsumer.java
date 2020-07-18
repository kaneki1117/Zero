package mq.activemq;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class QueueConsumer {

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

            MessageConsumer messageConsumer = session.createConsumer(myTestQueue);


            messageConsumer.setMessageListener(new MessageListener() {
                @Override
                public void onMessage(Message message) {
                    TextMessage msg = (TextMessage)message;
                    try {
                        System.out.println(msg.getText());
                    } catch (JMSException e) {
                        e.printStackTrace();
                    }
                }
            });

            Thread.sleep(50 * 1000);


            session.commit();
            session.close();

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
}
