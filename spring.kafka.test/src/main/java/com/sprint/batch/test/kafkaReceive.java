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
public class kafkaReceive {

	// @KafkaListener(topics = {"finanace-etl-convert"})
	// @KafkaListener(topics = "test",)
	// @KafkaListener(id ="bar",topicPartitions ={@TopicPartition(topic
	// ="topic2",partitions ="0"})
	@KafkaListener( id="id01",topicPartitions = { @TopicPartition(topic = "test", partitions = { "1" }) })
	public void receiveTopic1(ConsumerRecord<?, ?> consumerRecord) throws InterruptedException {
		System.out.println("1111Receiver on topic1: " + consumerRecord.value().toString());
		Thread.sleep(1000);

	}
	
}
