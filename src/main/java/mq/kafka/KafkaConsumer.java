package mq.kafka;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KafkaConsumer {

    public static void main(String[] args) {

        String topic = "test_topic";

        Map<String, Object> props = new HashMap<>();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("group.id", "testGroup1");
        props.put("enable.auto.commit", true);
        props.put("auto.commit.interval.ms", 1000);
        props.put("key.deserializer", StringDeserializer.class.getName());
        props.put("value.deserializer", StringDeserializer.class.getName());

        Consumer<String,String> consumer = new org.apache.kafka.clients.consumer.KafkaConsumer<String, String>(props);

        consumer.subscribe(Arrays.asList(topic));

        while (true) {

            ConsumerRecords<String,String> records = consumer.poll(100);
            for(ConsumerRecord<String,String> record : records) {
                System.out.printf("partition:%d,offset=%d,key=%s,value=%s%n",record.partition(),record.offset(),record.key(),record.value());
            }
        }



    }


}
