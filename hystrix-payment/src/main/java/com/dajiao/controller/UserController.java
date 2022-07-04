package com.dajiao.controller;

import com.dajiao.domian.User;
import com.dajiao.service.UserService;
import com.dajiao.vo.RespBean;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr.Yu
 * @create: 2022-07-04 21:06
 **/
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    @HystrixCommand(
            fallbackMethod = "defaultFallbackMethod",
            commandProperties ={@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value="3000")}
    )
    public RespBean get(@PathVariable("id") Integer id) {
        User user = userService.selectById(id);
//        int zero = 10/0;
//        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
        return new RespBean(200,"success:8005",user);
    }

    public RespBean defaultFallbackMethod(Integer id) {
        return new RespBean(500,"error: 8005",null);
    }

}
