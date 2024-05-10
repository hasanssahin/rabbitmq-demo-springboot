package com.hasansahin.rabbitmqdemo.controller;

import com.hasansahin.rabbitmqdemo.dto.User;
import com.hasansahin.rabbitmqdemo.publisher.RabbitMQJsonProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
@RequiredArgsConstructor
public class MessageJsonController {
    private final RabbitMQJsonProducer rabbitMQJsonProducer;

    @PostMapping("/jsonPublish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user) {
        rabbitMQJsonProducer.sendJsonMessage(user);
        return ResponseEntity.ok("Json sent to the RabbitMQ Successfully");
    }
}
