package com.dajiao.domian;

import lombok.Data;

import java.util.Date;

/**
 * @author: Mr.Yu
 * @create: 2022-07-02 20:39
 **/
@Data
public class User {

    private Integer id;
    private String username;
    private String account;
    private String password;
    private Date lastLoginTime;
    private String email;
    private int status;

}
