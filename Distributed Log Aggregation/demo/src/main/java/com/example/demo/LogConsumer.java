package com.example.demo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class LogConsumer {

    @KafkaListener(topics = "logs", groupId = "log-consumer-group")
    public void consumeLogs(ConsumerRecord<String, String> record) {
        String logMessage = record.value();
        // Process and store the log message as per your requirements
        System.out.println("Received log: " + logMessage);
    }
}

