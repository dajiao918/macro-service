package com.dajiao.controller;

import com.dajiao.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;

/**
 * @author: Mr.Yu
 * @create: 2022-07-09 20:33
 **/
@RestController
public class ProviderController {

    @Autowired
    ProviderService providerService;

    @GetMapping("/send")
    public void send(){
        providerService.send();
    }

}
