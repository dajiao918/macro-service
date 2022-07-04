package com.dajiao.service.impl;

import com.dajiao.service.PaymentService;
import com.dajiao.vo.RespBean;
import org.springframework.stereotype.Component;

/**
 * @author: Mr.Yu
 * @create: 2022-07-04 21:54
 **/
@Component
public class HystrixPaymentService implements PaymentService {
    @Override
    public RespBean get(Integer id) {
        return new RespBean(500,"降级和服务代码分离",null);
    }
}
