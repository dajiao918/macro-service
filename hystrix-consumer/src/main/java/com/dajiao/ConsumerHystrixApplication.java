package com.dajiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: Mr.Yu
 * @create: 2022-07-04 21:33
 **/
@SpringBootApplication
@EnableFeignClients("com.dajiao.service")
@EnableCircuitBreaker
public class ConsumerHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixApplication.class, args);
    }
}
