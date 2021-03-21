package com.alex.recv;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by alex.zhao on 2021/3/21 22:52
 */
@Component
//监听队列
@RabbitListener(queues = "amqp_queue")
public class RecvInit {

    //监听之后获取消息的处理方法
    @RabbitHandler
    public void testRecv(String message){
        System.out.println("receive message:"+message);
    }
}
