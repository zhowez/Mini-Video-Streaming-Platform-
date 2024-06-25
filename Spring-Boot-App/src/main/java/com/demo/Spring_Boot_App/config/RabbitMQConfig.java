// File: RabbitMQConfig.java
package com.demo.Spring_Boot_App.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue videoQueue() {
        return new Queue("videoQueue", true);
    }
}
