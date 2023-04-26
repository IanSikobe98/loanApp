package com.example.loanapp.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class RabbitProducerService {

    private final RabbitTemplate rabbitTemplate;

    public RabbitProducerService(final RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendRequestToQueue(String queue, String bindingKey, Object message) {
        this.rabbitTemplate.convertAndSend(queue, bindingKey, message);
    }
}