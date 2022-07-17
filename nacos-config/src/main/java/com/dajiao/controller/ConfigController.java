package com.dajiao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController{

    @Value("${user.name}")
    private String username;
    @Value("${user.age}")
    private Integer age;

    @GetMapping("/user")
    public String userInfo(){
        System.out.println(username+age);
        return "{username: " + username + ", age: " + age + "}";
    }
}