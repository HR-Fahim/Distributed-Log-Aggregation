package com.example.demo;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class LogProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String logTopic = "logs";

    public LogProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendLog(String logMessage) {
        kafkaTemplate.send(logTopic, logMessage);
    }
}

