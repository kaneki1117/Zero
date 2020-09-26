package mq.rocket;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

public class RocketConsumer {

    public static void main(String[] args) throws Exception {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("consumer_group1");

        consumer.setNamesrvAddr("localhost:9876");

        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);

        consumer.subscribe("topic_example", "*");

        consumer.registerMessageListener((List<MessageExt> list, ConsumeConcurrentlyContext context) -> {
            if(list != null) {
                for(MessageExt ext : list) {
                    try{
                        System.out.println(new Date() + new String(ext.getBody(), "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }

            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;

        });

        consumer.start();
        System.out.println("消费者已启动");

    }
}
