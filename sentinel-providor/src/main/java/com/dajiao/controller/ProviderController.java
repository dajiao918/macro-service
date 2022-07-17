package com.dajiao.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr.Yu
 * @create: 2022-07-16 10:20
 **/
@RestController
@Slf4j
public class ProviderController {

    @GetMapping("/hi")
//    @SentinelResource(value = "g")
    public String mono() throws InterruptedException {
//        log.info("hello");
//        Thread.sleep(1000);
        throw new RuntimeException();
        return "hello";
    }

}
