package com.mob.demo.service.impl;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.mob.demo.beans.User;
import com.mob.demo.domain.App;
import com.mob.demo.kafka.KafkaSender;
import com.mob.demo.mongo.UserRepository;
import com.mob.demo.service.AppInfoService;
import com.mob.demo.service.DemoService;
import com.mob.jedis.client.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/6/2:12:25
 */
//@Service

@Path("demo")
@com.alibaba.dubbo.config.annotation.Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private AppInfoService appInfoService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RedisClient redisClient;


    @Autowired
    private KafkaSender kafkaSender;


    @GET
    @Path("/kafka")
    @Produces(ContentType.TEXT_PLAIN_UTF_8)
    @Override
    public String kafka() {

        kafkaSender.sendMessage();

        return "ok";
    }


    @GET
    @Path("/jedis")
    @Produces(ContentType.TEXT_PLAIN_UTF_8)
    public String jedis() {

        String test = redisClient.get("test");

        return "test=" + test;
    }

    @GET
    @Path("test")
    @Produces(ContentType.TEXT_PLAIN_UTF_8)
    public String test() {
        System.out.println("demo  method!!");

        App app = appInfoService.getAppByAppKey("androidv1101");


        User user = userRepository.findByName("fuck");

        String test = redisClient.get("test");


        return "from demo service" + app.getStorename().toString() + ",user=" + user.toString() + ",test=" + test;
    }
}
