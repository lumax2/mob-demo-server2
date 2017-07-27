package com.mob.demo.redis;

import com.mob.jedis.client.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/7/27:12:24
 */
@Service
public class RedisTestService {
    @Autowired
    private RedisClient redisClient;

    public void testRedis(){
        redisClient.set("key","value");
    }
}
