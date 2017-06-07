package com.mob.service.impl;

import com.mob.service.DemoService;
import org.springframework.stereotype.Service;

import javax.ws.rs.Path;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/6/2:12:25
 */
//@Service

//@Path("demo")
@com.alibaba.dubbo.config.annotation.Service
public class DemoServiceImpl implements DemoService {
    public String test() {
        System.out.println("demo  method!!");
        return "from demo service";
    }
}
