package com.dajiao.controller;

import com.dajiao.domian.User;
import com.dajiao.service.UserService;
import com.dajiao.vo.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr.Yu
 * @create: 2022-07-02 20:52
 **/
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public RespBean get(@PathVariable("id") Integer id) {
        User user = userService.selectById(id);
        return new RespBean(200,"success:8002",user);
    }

}
