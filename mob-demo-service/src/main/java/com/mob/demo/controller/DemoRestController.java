package com.mob.demo.controller;

import com.mob.demo.dubbox.DubboDemoClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot controller 演示类(后续将提供更多演示demo，大家也可以自行去springboot官网学习：
 * http://projects.spring.io/spring-boot/
 * User: zhouzhipeng
 * Date: 2017/7/27:12:02
 */

// 相当于 @Controller + @ResponseBody
// 该注解 方法method 返回类型是String时候则返回string,返回对象时候则讲json_encode 该对象的json字符串
@RestController
@RequestMapping(value = "/demo")
public class DemoRestController {

    @Autowired
    private DubboDemoClientService dubboDemoClientService;

    /**
     * 请求： http://localhost:8080/demo/ http方式：get 请求返回contentType: text/plain
     * 请求responseBody: "Hello page"
     */
    @RequestMapping
    public String index() {
        dubboDemoClientService.doSome();
        return "Hello page";
    }


    /**
     * 普通get请求， 参数 @RequestParam 标注请求的参数名称和类型，可以填入默认值等.
     *
     * @param name
     * @return 纯字符串
     */
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "mob") String name) {
        return "hello " + name;
    }


    /**
     * 路径参数：包含在路径中  如: /book/123  (123业务上多为book的id）
     */
    @RequestMapping("/hello2/{myName}")
    public String hello2(@PathVariable String myName) {
        return "Hello " + myName + "!!!";
    }


    /**
     * 返回类型为一个对象，则会被序列化为json字符串
     *
     * @param myName
     * @return
     */
    @RequestMapping("/getDemo/{myName}")
    User getDemo(@PathVariable String myName) {
        User user = new User();
        user.setId(123);
        user.setName(myName);
        return user;
    }



    public static class User {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
