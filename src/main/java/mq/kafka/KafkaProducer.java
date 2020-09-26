package mq.kafka;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.HashMap;
import java.util.Map;

public class KafkaProducer {

    public static void main(String[] args) {

        Map<String, Object> props = new HashMap<>();
        props.put("bootstrap.servers","localhost:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("key.serializer", StringSerializer.class.getName());
        props.put("value.serializer", StringSerializer.class.getName());
        props.put("key.deserializer", StringDeserializer.class.getName());
        props.put("value.deserializer", StringDeserializer.class.getName());
        props.put("zk.connect","127.0.0.1:2181");

        String topic = "test_topic";
        Producer<String,String> producer = new org.apache.kafka.clients.producer.KafkaProducer<String, String>(props);

        producer.send(new ProducerRecord<String,String>(topic,"idea-key2","java-message-1"));
        producer.send(new ProducerRecord<String,String>(topic,"idea-key2","java-message-2"));
        producer.send(new ProducerRecord<String,String>(topic,"idea-key2","java-message-3"));
        producer.send(new ProducerRecord<String,String>(topic,"idea-key2","java-message-4"));

        producer.close();

    }
}
