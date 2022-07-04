package com.dajiao.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dajiao.domian.User;
import com.dajiao.vo.RespBean;
import org.springframework.stereotype.Service;

/**
 * @author: Mr.Yu
 * @create: 2022-07-02 20:37
 **/
@Service
public interface UserService extends BaseMapper<User> {
}
