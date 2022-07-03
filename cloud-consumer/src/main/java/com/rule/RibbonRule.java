package com.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Mr.Yu
 * @create: 2022-07-03 15:18
 **/
@Configuration
public class RibbonRule {

    @Bean
    public IRule getRule() {
        return new RandomRule();
    }
}
