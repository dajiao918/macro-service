package com.dajiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Mr.Yu
 * @create: 2022-07-02 20:54
 **/
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.dajiao.service")
public class Payment2Application {

    public static void main(String[] args) {
        SpringApplication.run(Payment2Application.class, args);
    }

}
