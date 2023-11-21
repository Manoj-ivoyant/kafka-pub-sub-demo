package com.ivoyant.kafkapub.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner {
    private final Logger LOGGER = LoggerFactory.getLogger(KafkaListner.class);

    @KafkaListener(topics = "ivoyant-demo", groupId = "group1")
    public void consumeMessage(String message) {
        LOGGER.info("message from the publisher {}", message);
    }

    @KafkaListener(topics="ivoyant-demo",groupId ="group1" )
    public void consumeMessage1(String message){
        LOGGER.info("message consumed by consumer2 {}",message);
    }
}
