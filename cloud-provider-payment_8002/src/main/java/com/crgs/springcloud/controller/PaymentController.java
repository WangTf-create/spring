package com.crgs.springcloud.controller;

import com.crgs.springcloud.entities.CommonResult;
import com.crgs.springcloud.entities.Payment;
import com.crgs.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

    @Value("${server.port}")
    private String serverPort;


    @PostMapping(value = "/v1/payment/create", produces = "application/json;charset=utf-8")
    public String create(@RequestBody Payment payment) {
        int res = paymentService.addPayment(payment);
        log.info("*******插入结果：" + res);
        if (res > 0) {
            return CommonResult.okMessage(res, serverPort);
        }
        return CommonResult.exceptionSys();
    }

    @GetMapping(value = "/v1/payment/{id}")
    public String getPaymentById(@PathVariable("id") Long id) {
        log.info("*******查询ID：" + id);
        Payment payment = paymentService.getPaymentById(id);
        return CommonResult.okMessage(payment, serverPort);
    }
}
