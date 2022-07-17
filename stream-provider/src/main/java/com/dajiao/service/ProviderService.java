package com.dajiao.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

/**
 * @author: Mr.Yu
 * @create: 2022-07-09 20:22
 **/

public interface ProviderService {

    public void send();

}
