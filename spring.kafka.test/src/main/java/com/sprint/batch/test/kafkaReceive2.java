package com.sprint.batch.test;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;



@Component
@Configuration
@ConditionalOnProperty(name = "xiyu.mq.type", havingValue = "kafka")
public class kafkaReceive2 {
	
   // @KafkaListener(topics = {"finanace-etl-convert"})
	@KafkaListener(id="id00",topicPartitions = { @TopicPartition(topic = "test", partitions = { "0" }) })
    public void receiveTopic1(ConsumerRecord<?, ?> consumerRecord) throws InterruptedException {
        System.out.println("222Receiver on topic1: "+consumerRecord.value().toString());
        Thread.sleep(1000);
    }
}
