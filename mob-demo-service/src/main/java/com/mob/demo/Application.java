package com.mob.demo;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.net.InetAddress;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/6/2:11:41
 */

@SpringBootApplication
@EnableScheduling
//@ImportResource("classpath:dubbo-*.xml")//启动加在dubbo配置文件
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);


        try {
            // on startup

//            TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
////                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("host1"), 9300))
//                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localcentos"), 9300));
//
//            // on shutdown
//            System.out.println(client);
//            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
