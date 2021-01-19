package com.crgs.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/19 13:18
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    public String serverPort;

    @GetMapping(value = "/payment/consul")
    public String payment() {
        return "spring cloud with consul:" + serverPort + "\t" + UUID.randomUUID();
    }

}
