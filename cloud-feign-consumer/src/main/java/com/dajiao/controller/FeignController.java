package com.dajiao.controller;

import com.dajiao.service.PaymentService;
import com.dajiao.vo.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr.Yu
 * @create: 2022-07-03 19:52
 **/
@RestController
public class FeignController {

    @Autowired
    PaymentService service;

    @GetMapping("/feign/{id}")
    public RespBean service(@PathVariable("id") Integer id) {
        return service.get(id);
    }
}
