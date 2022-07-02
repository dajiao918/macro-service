package com.dajiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: Mr.Yu
 * @create: 2022-07-02 19:53
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication2.class, args);
    }

}
