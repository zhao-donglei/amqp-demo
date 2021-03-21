package com.alex.send;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by alex.zhao on 2021/3/21 22:39
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RabbitMQTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSend(){
        String message="hello world";
        System.out.println("send message:"+message);
        //发送消息
        rabbitTemplate.convertAndSend("amqp_exchange","test.amqp",message);
    }
}
