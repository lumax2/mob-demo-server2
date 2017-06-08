package com.mob.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mob.demo.beans.User;
import com.mob.demo.service.UserService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/6/7:11:23
 */

@Path("users")
@Service
public class UserServiceImpl implements UserService {
    @POST
    @Path("register")
    @Consumes({MediaType.APPLICATION_JSON})
    @Override
    public void registerUser(User user) {
        System.out.println(user.toString());
    }
}
