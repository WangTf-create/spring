package com.crgs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/19 13:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMainConsul {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainConsul.class, args);
    }
}
