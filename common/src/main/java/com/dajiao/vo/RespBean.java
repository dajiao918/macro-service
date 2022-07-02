package com.dajiao.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Mr.Yu
 * @create: 2022-07-02 20:35
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespBean {

    private int code;
    private String msg;
    private Object data;

}
