package com.mob.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot controller 演示类
 * User: zhouzhipeng
 * Date: 2017/7/27:12:02
 */

@RestController
@RequestMapping(value = "/demo")
public class DemoRestController {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam("name") String name){
        return "hello "+name;
    }

}
