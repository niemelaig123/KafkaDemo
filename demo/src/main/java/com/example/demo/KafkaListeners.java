package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "spring_topic_1", groupId = "springID")
    void listener(String data) {
        System.out.println("Listener Received: " + data + " Hooray!");
    }
}
