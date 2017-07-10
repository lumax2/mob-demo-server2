//package com.mob.demo.kafka;
//
//import com.alibaba.fastjson.JSONObject;
//import com.mob.demo.beans.Message;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class KafkaReceiver {
//
//    @KafkaListener(topics = "test1")
//    public void processMessage(String content) {
//        Message m = JSONObject.parseObject(content, Message.class);
//
//        System.out.println(m);
//    }
//}