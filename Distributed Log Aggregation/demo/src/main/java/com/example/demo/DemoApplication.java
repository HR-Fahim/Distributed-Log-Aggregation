package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        LogProducer logProducer = context.getBean(LogProducer.class);

        // Produce some log messages
        logProducer.sendLog("Log message 1");
        logProducer.sendLog("Log message 2");
    }
}
