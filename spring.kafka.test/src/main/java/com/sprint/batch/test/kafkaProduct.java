package com.sprint.batch.test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;



@Component
@EnableScheduling
public class kafkaProduct {

	@Autowired
    private   KafkaTemplate<String, String> kafkaTemplate;

	
    int i=0;
 //  private Gson gson = new GsonBuilder().create();

    //发送消息方法
	//@Scheduled(fixedDelay = 10)
	public   void send() {
	    kafkaTemplate.send("test", "b"+i);
	    //System.out.println("Message: ");
	    i++;
	}
}
