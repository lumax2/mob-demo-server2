package com.mob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/6/2:11:41
 */

@SpringBootApplication
//@ImportResource("classpath:dubbo-*.xml")//启动加在dubbo配置文件
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
