package com.crgs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/15 13:41
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain1 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain1.class, args);
    }
}
