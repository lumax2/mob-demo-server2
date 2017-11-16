package com.mob.demo.controller;

import com.mob.demo.dubbox.DubboDemoClientService;
import com.mob.demo.es.ESTestService;
import com.mob.demo.service.DemoService;
import com.mob.util.log.ErrorOutput;
import com.mob.web.anno.MobBody;
import com.mob.web.anno.MobResponse;
import com.mob.web.entity.MobException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static com.mob.web.entity.ClientErrorCode.*;
import static com.mob.web.entity.ServerErrorCode.*;


/**
 * springboot controller 演示类(后续将提供更多演示demo，大家也可以自行去springboot官网学习：
 * http://projects.spring.io/spring-boot/
 * User: zhouzhipeng
 * Date: 2017/7/27:12:02
 */

// 相当于 @Controller + @ResponseBody
// 该注解 方法method 返回类型是String时候则返回string,返回对象时候则讲json_encode 该对象的json字符串
@Controller
@RequestMapping(value = "/demo")
public class DemoRestController {

    // log4j2
    private static final Logger logger = LogManager.getLogger(DemoRestController.class);

    //引用dubbo服务
    @Autowired
    private DubboDemoClientService dubboDemoClientService;


    @Autowired
    private DemoService demoService;


    @RequestMapping("/dubbo")
    @ResponseBody
    public String testDemmo() {
        dubboDemoClientService.doSome();

        return "Hello dubbo!";
    }


    /**
     * 请求： http://localhost:8080 http方式：get 请求返回contentType: text/plain
     */
    @RequestMapping
    @ResponseBody
    public String index() {
        demoService.doSth();

        //log4j2 使用，和log4j一样
        logger.info("info log test!!");

        //ErrorOutput专用日志输出
        ErrorOutput.log(new RuntimeException("test error"));

        return "Hello mob!";
    }


    /**
     * 普通get请求， 参数 @RequestParam 标注请求的参数名称和类型，可以填入默认值等.
     *
     * @param name
     * @return 纯字符串
     */
    @RequestMapping(value = "/hello",method = {RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam(value = "name", defaultValue = "mob") String name) {
        return "hello " + name;
    }


    /**
     * 路径参数：包含在路径中  如: /book/123  (123业务上多为book的id）
     */
    @RequestMapping("/hello2/{myName}")
    @ResponseBody
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
    @ResponseBody
    User getDemo(@PathVariable String myName) {
        User user = new User();
        user.setId(123);
        user.setName(myName);
        return user;
    }


    @Autowired
    private ESTestService esTestService;


    @RequestMapping(value = "/testes")
    @ResponseBody
    public String testES() {
        try {
            esTestService.findDB();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ok";
    }


    @PostMapping(value = "/mobjson")
    @MobResponse
    public String mobjson(@MobBody User user, @RequestHeader(value="User-Agent") String contentType) {

        logger.error("==========> jsonStr:"+user);

        int a=1/0;

//
//        boolean sthError=true; //模拟业务异常
//        if(sthError){
//            throw new MobException(_5004,"please try it next time!");
//        }


        return new User(1,"zhouzhipeng,"+contentType+",decoded body:"+user).toString();
    }

    public static class User {
        private int id;
        private String name;

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public User() {
        }

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
