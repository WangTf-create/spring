package com.crgs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/17 13:16
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMainServer2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMainServer2.class, args);
    }
}
