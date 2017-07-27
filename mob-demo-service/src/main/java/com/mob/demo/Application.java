package com.mob.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/6/2:11:41
 */

@SpringBootApplication(scanBasePackages = "com.mob.demo")
@PropertySource(value = "classpath:mybatis.properties",ignoreResourceNotFound = true)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
