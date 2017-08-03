package com.mob.demo;

import com.mob.demo.intercept.RequestLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/6/2:11:41
 */

@SpringBootApplication(scanBasePackages = "com.mob.demo")
@PropertySource(value = "classpath:mybatis.properties",ignoreResourceNotFound = true)
public class Application  {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }


//    // 增加拦截器
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new RequestLog());
//        //.addPathPatterns("/user/**");  //对来自/user/** 这个链接来的请求进行拦截
//    }
//
//
//    @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
//        argumentResolvers.add(new MobArgumentResolver());
//    }


    //加个停止钩子
}
