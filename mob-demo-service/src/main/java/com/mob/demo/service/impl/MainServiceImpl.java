package com.mob.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mob.demo.service.MainService;

import javax.ws.rs.Path;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/6/7:17:48
 */
@Path("/")
@Service
public class MainServiceImpl implements MainService {
    @Path("/")
    public String echo(String name) {
        return "hello"+name;
    }
}
