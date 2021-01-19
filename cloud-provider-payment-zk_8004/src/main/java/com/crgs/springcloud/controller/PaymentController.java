package com.crgs.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/18 16:12
 *
 * zookeeper作为服务注册节点，是临时节点
 *
 * zookeeper的节点共有四种类型，临时节点 带序号的临时节点、持久节点、带序号的持久节点
 *
 * 当关闭作为微服务服务节点的payment模块时，wait a moment ,zookeeper会将节点信息删除
 *
 * */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String paymentWithZookeeper() {
        return "springcloud with zookeeper :" + serverPort + "\t" + UUID.randomUUID();

    }
}
