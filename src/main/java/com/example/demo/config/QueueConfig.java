//package com.example.demo.config;
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.DirectExchange;
//import org.springframework.amqp.core.Queue;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class QueueConfig {
//    /** 队列名称 */
//    public static final String QUEUE_NAME = "queue.deyi.iot.updownline.message";
//    /** 交换机名字 */
//    public static final String EXCHANGE_NAME = "exchange.deyi.iot.updownline.common";
//
//    @Bean
//    public Queue msgQueue() {
//        return new Queue(QUEUE_NAME, true);
//    }
//
//    @Bean
//    public DirectExchange directExchange() {
//        return new DirectExchange(EXCHANGE_NAME, true, false);
//    }
//
//    @Bean
//    public Binding bindMsgQueue() {
//        return BindingBuilder.bind(msgQueue()).to(directExchange()).with(QUEUE_NAME);
//    }
//}
