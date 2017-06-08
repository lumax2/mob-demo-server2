package com.mob.test;


import com.alibaba.dubbo.config.annotation.Reference;
import com.mob.demo.Application;
import com.mob.demo.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class TestServicesTest {

    @Reference
    private DemoService demoService;

    @Test
    public void testShow() {
        demoService.test();
//        System.out.println("test");
    }

}