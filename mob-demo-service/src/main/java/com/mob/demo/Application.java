package com.mob.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.net.InetAddress;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/6/2:11:41
 */

@SpringBootApplication
//@EnableAutoConfiguration
@EnableScheduling
@PropertySource(value = {"classpath:redis.yml"}/*, ignoreResourceNotFound = true*/)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
