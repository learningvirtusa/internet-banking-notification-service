package com.core.banking.notification.service.internetbankingnotificationservice.controller;

import com.core.banking.notification.service.internetbankingnotificationservice.producer.RabbitMqSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/")
public class ProducerController {

    private RabbitMqSender rabbitMqSender;

    @Autowired
    public ProducerController(RabbitMqSender rabbitMqSender) {
        this.rabbitMqSender = rabbitMqSender;
    }

    @PostMapping(value = "user")
    public String publishUserDetails(@RequestBody Map<String, Object> data) {
        rabbitMqSender.send(data);
        return "Ok";
    }
}
