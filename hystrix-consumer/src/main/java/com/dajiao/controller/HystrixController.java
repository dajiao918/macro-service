package com.dajiao.controller;

import com.dajiao.service.PaymentService;
import com.dajiao.vo.RespBean;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr.Yu
 * @create: 2022-07-03 19:52
 **/
@RestController
//@DefaultProperties(defaultFallback = "defaultFallbackMethod")
public class HystrixController {

    @Autowired
    PaymentService service;

    @GetMapping("/hystrix/{id}")
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1000")
    })
    public RespBean service(@PathVariable("id") Integer id) {
        int zero = 10/0;
        return service.get(id);
    }

    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true")
    })
    @GetMapping("/hystrix-circuit/{id}")
    public RespBean hystrixCircuit(@PathVariable("id") Integer id) {
        if (id < 0) {
            int zero = id / 0;
        }
        return service.get(id);
    }

    public RespBean defaultFallbackMethod() {
        return new RespBean(500,"客户端调用服务端，服务端发生超时",null);
    }

}
