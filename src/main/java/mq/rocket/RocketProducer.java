package mq.rocket;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

public class RocketProducer {

    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("producer_group1");
        producer.setNamesrvAddr("localhost:9876");

        producer.start();

        for (int i = 0; i < 50; i++) {

            Message msg = new Message("topic_example","Tag",("hello Java from RocketMQ" + i).getBytes(RemotingHelper.DEFAULT_CHARSET));

            SendResult sendResult = producer.send(msg);

            System.out.printf("%s%n",sendResult);

        }

        producer.shutdown();

    }


}
