package com.dajiao;

import com.netflix.discovery.DiscoveryClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author: Mr.Yu
 * @create: 2022-07-02 16:12
 **/
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.dajiao.service")
public class PaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }
}
