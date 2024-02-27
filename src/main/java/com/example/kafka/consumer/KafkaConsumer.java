package com.example.kafka.consumer;

import com.example.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "logi",groupId = "myGroup")
    public void consumeMsg(String msg)
    {
        log.info(String.format("consuming the Message form logi topic %s",msg));

    }
    @KafkaListener(topics = "logi",groupId = "myGroup")
    public void consumeJsonMsg(Student student)
    {
        log.info(String.format("consuming the Message form logi topic %s",student.toString()));

    }
}
