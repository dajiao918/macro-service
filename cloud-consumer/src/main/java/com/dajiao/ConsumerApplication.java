package com.dajiao;

import com.rule.RibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author: Mr.Yu
 * @create: 2022-07-02 16:32
 **/
@EnableEurekaClient
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RibbonClient(name = "PAYMENT",configuration = RibbonRule.class)
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
