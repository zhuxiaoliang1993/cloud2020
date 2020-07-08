package com.ynet.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("payment/consul")
    public String paymentZK() {
        return "SpringCloud with consul" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
