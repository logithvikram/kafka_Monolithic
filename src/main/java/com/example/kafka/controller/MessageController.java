package com.example.kafka.controller;

import com.example.kafka.payload.Student;
import com.example.kafka.producer.KafkaJsonProducer;
import com.example.kafka.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {

    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String msg){
        kafkaProducer.sendMessage(msg);
        return ResponseEntity.ok("successfull");
    }
    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(@RequestBody Student Message){
        kafkaJsonProducer.sendMessage(Message);
        return ResponseEntity.ok("successfull Json");
    }
}
