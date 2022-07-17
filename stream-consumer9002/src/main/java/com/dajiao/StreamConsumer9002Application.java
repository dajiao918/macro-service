package com.dajiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Mr.Yu
 * @create: 2022-07-09 20:38
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamConsumer9002Application {

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumer9002Application.class, args);
    }

}
