package com.example.loanapp.services;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class QueueService {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Scheduled(fixedDelay = 3000)
    public void sendDataToQueue(){
        System.out.println("pushed ");
        RabbitProducerService rabbitProducer = new RabbitProducerService(rabbitTemplate);
        List<String> test = Arrays.asList("ian","leon","Laura","Kellie","Grace","Dan","Mary");

        for(int i=0;i<5;i++) {
            String message = "Hello " +test.get(i);
            rabbitProducer.sendRequestToQueue("BATCH_SCORING_QUEUE1", "BATCH_SCORING_QUEUE1", message);
            System.out.println("pushed "+ message);
        }

    }

}
