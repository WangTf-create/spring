package com.crgs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/15 15:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainZk {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainZk.class, args);
    }
}
