package com.dajiao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Mr.Yu
 * @create: 2022-07-10 13:34
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerApplication {

    @RestController
    public class ConsumerController {

        @Autowired
        LoadBalancerClient loadBalancerClient;
        @Autowired
        RestTemplate restTemplate;


        @GetMapping("/consumer/{str}")
        public String consume(@PathVariable("str") String str) {
            ServiceInstance instance = loadBalancerClient.choose("nacos-provider");
            String path = String.format("http://%s:%s/echo/",instance.getHost(),instance.getPort());
            System.out.println("request path:" +path);
            return restTemplate.getForObject(path+str, String.class);
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
