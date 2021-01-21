package com.crgs.springcloud.controller;

import com.crgs.springcloud.entities.CommonResult;
import com.crgs.springcloud.entities.Payment;
import com.crgs.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/15 14:38
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/v1/payment/discovery")
    public Object discovery() {
        for (String element : discoveryClient.getServices()) {
            log.info("****element:" + element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getInstanceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }


    @PostMapping(value = "/v1/payment/create", produces = "application/json;charset=utf-8")
    public String create(@RequestBody Payment payment) {
        int res = paymentService.addPayment(payment);
        log.info("*******插入结果：" + res);
        if (res > 0) {
            return CommonResult.ok(serverPort);
        }
        return CommonResult.exceptionSys();
    }

    @GetMapping(value = "/v1/payment/{id}")
    public String getPaymentById(@PathVariable("id") Long id) {
        log.info("*******查询ID：" + id);
        Payment payment = paymentService.getPaymentById(id);
        return CommonResult.okMessage(payment, serverPort);
    }


    /**
     * 用于测试自定义的LB（load balance）负载均衡
     */
    @GetMapping(value = "/payment/custom/balance")
    public String testCustomLB() {
        return serverPort;
    }

}
