package com.ynet.controller;

import com.ynet.entities.CommonResult;
import com.ynet.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderConsulController {

    public static final String PAYMENT_URL = "http://consul-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("consumer/payment/consul")
    public String  create() {
        String result = restTemplate.getForObject(PAYMENT_URL + "/payment/consul", String.class);
        return result;
    }
}
