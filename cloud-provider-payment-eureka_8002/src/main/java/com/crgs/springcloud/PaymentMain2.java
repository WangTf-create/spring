package com.crgs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/15 13:41
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain2 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain2.class, args);
    }
}
