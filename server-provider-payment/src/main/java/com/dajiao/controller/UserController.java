package com.dajiao.controller;

import com.dajiao.domian.User;
import com.dajiao.service.UserService;
import com.dajiao.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Mr.Yu
 * @create: 2022-07-02 20:33
 **/
@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/user/{id}")
    public RespBean get(@PathVariable("id") Integer id) {
        User user = userService.selectById(id);
        return new RespBean(200,"success:8001",user);
    }

    @GetMapping("/discover")
    public DiscoveryClient client() {

        List<String> services = discoveryClient.getServices();
        services.forEach(service->{
            log.info("service: {}", service);
        });
        List<ServiceInstance> payment = discoveryClient.getInstances("PAYMENT");
        payment.forEach(info->{
            log.info("id: {}- host: {}- uri: {}",info.getServiceId(),info.getHost(),info.getUri());
        });
        return discoveryClient;
    }


}
