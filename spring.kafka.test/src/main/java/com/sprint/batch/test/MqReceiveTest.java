package com.sprint.batch.test;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;  



@Component 
@Configuration
@ConditionalOnProperty(name = "xiyu.mq.type", havingValue = "activemq")
public class MqReceiveTest {  
     // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息  
    @JmsListener(destination = "test")  
    public void receiveQueue(Message message) throws InterruptedException, JMSException {  
    	TextMessage textMsg = (TextMessage) message;
        System.out.println("收到的报文为:"+textMsg.getText());  
        //Thread.sleep(10000);
    }  
} 
