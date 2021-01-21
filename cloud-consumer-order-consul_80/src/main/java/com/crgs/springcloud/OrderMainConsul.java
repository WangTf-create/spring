package com.crgs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/19 13:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainConsul {

    public static void main(String[] args) {
        SpringApplication.run(OrderMainConsul.class, args);
    }
}
