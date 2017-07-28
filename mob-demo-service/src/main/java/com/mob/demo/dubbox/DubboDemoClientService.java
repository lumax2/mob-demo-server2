package com.mob.demo.dubbox;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * 演示：一个正常的spring service调用dubbo服务
 * User: zhouzhipeng
 * Date: 2017/7/27:12:32
 */
@Service
public class DubboDemoClientService {
//    @Reference
//    private DubboDemoService dubboDemoService;

    public void doSome(){
        System.out.println("do something !!!");
    }
}
