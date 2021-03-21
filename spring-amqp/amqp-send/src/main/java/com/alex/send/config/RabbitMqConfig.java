package com.alex.send.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by alex.zhao on 2021/3/21 22:29
 */
@Configuration
public class RabbitMqConfig {

    //声明队列
    @Bean
    public Queue queue(){
        return new Queue("amqp_queue");
    }

    //声明交换机--主题模式
    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("amqp_exchange");
    }

    //绑定交换机和队列
    @Bean
    public Binding binding(){
        return BindingBuilder.bind(queue()).to(topicExchange()).with("*.amqp.#");
    }

}
