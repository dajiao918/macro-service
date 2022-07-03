package com.dajiao.service;

import com.dajiao.domian.User;
import com.dajiao.vo.RespBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: Mr.Yu
 * @create: 2022-07-03 19:48
 **/
@Service
@FeignClient(value = "PAYMENT")
public interface PaymentService {

    @GetMapping("/user/{id}")
    public RespBean get(@PathVariable("id") Integer id);
}
