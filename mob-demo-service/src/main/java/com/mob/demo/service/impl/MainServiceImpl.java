package com.mob.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.mob.demo.service.DemoService;
import com.mob.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Path;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/6/7:17:48
 */
@Path("/")
@Service
public class MainServiceImpl implements MainService {

    @Reference
    private DemoService demoService;

    @Path("/")
    public String echo(String name) {
        return "hello"+name;
    }
}
