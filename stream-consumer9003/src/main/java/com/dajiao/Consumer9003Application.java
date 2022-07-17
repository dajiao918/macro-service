package com.dajiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Mr.Yu
 * @create: 2022-07-09 20:51
 **/
@SpringBootApplication
@EnableEurekaClient
public class Consumer9003Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer9003Application.class, args);
    }

}
