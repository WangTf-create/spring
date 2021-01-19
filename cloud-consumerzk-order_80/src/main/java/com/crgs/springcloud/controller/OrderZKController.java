package com.crgs.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/15 15:51
 */
@RestController
@Slf4j
public class OrderZKController {

    /**
     * INVOKE_URL 代表在zookeeper节点上的路径,这里可能需要重启
     */
    private static final String INVOKE_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping(value = "/payment/zk")
    public String getPayment() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    }


}

