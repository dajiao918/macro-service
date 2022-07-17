package com.dajiao.service.impl;

import com.dajiao.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import java.util.UUID;

/**
 * @author: Mr.Yu
 * @create: 2022-07-09 20:24
 **/
@EnableBinding(Source.class)
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    MessageChannel output;

    @Override
    public void send() {
        String s = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(s).build());
        System.out.println("发送消息=====>"+s);
    }
}
