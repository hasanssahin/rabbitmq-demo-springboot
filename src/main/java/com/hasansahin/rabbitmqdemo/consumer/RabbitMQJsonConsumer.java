package com.hasansahin.rabbitmqdemo.consumer;

import com.hasansahin.rabbitmqdemo.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

    @RabbitListener(queues = "${rabbitmq.json.queue.name}")
    public void consumeJsonMessage(User user) {
        LOGGER.info(String.format("Json Message received -> %s", user));
    }
}
