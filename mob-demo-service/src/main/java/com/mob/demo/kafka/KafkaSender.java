package com.mob.demo.kafka;

import java.util.Date;

import java.util.UUID;

import com.alibaba.dubbo.common.json.JSONObject;
import com.mob.demo.beans.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
public class KafkaSender {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage() {
        Message m = new Message();
        m.setId(System.currentTimeMillis());
        m.setMsg(UUID.randomUUID().toString());
        m.setSendTime(new Date());
        kafkaTemplate.send("test1", com.alibaba.fastjson.JSONObject.toJSONString(m));
    }
}