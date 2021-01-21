package com.crgs.springcloud.controller;

import com.crgs.springcloud.entities.CommonResult;
import com.crgs.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class OrderController {
    /**
     * PAYMENT_URL payment服务端访问地址
     */
    //private static final String PAYMENT_URL = "http://localhost:8001/";
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE/";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/create")
    public String createPayment(Payment payment) {
        return restTemplate.postForObject(
                PAYMENT_URL + "v1/payment/create",
                        payment,
                        String.class);
    }

    @GetMapping(value = "/consumer/payment/{id}")
    public String getPayment(@PathVariable(value = "id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/v1/payment/" + id, String.class);
    }

    /**
     * 测试自定义的负载均衡LB
     *
     * @return 响应体
     */
    public String testCustomLB(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(PAYMENT_URL + "/payment/custom/balance", String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody();
        }
        return CommonResult.exceptionSys();

    }


}

