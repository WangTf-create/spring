package com.crgs.ribbon.irule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangtongfa
 * @version 1.0
 * @date 2021/1/20 10:32
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule getRule() {
        //默认使用的是轮询，现在使用随机负载均衡算法
        return new RandomRule();
    }
}
