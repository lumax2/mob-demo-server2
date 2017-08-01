package com.mob.demo.service;


import org.springframework.stereotype.Service;

/**
 * 正常的spring service ，注意与dubbox服务类的注解区别
 * @org.springframework.stereotype.Service;
 * @com.alibaba.dubbo.config.annotation.Service

 * User: zhouzhipeng
 * Date: 2017/7/28:16:59
 */
@Service
public class DemoService {
    public String doSth(){
        return "do something";
    }
}
