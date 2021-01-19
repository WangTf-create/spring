package com.crgs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/18 16:09
 *
 *  注解@EnableDiscoveryClient 该注解用于向使用consul或者zk作为注册中心时注册服务
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMainZookeeperOne {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainZookeeperOne.class, args);
    }
}
