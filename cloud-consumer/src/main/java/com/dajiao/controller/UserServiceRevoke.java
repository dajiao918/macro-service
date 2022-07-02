package com.dajiao.controller;

import com.dajiao.vo.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Mr.Yu
 * @create: 2022-07-02 21:15
 **/
@RestController
public class UserServiceRevoke {

    @Autowired
    RestTemplate restTemplate;

    public static final String url = "http://PAYMENT";

    @GetMapping("/user/{id}")
    public RespBean revoke(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(url+"/user/"+id, RespBean.class);
    }

}
