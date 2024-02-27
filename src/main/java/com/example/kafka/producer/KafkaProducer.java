package com.example.kafka.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String,String> KafkaTemplate;

    public void sendMessage(String msg){
        log.info(String.format("sending message to logi topic::%s",msg));
        KafkaTemplate.send("logi",msg);
    }
}
