//package com.mob.demo.dubbox;
//
//import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
//
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//
///**
// * 在正常dubbo服务类的基础上增加了rest功能，方便将已存在的dubbo服务类暴露给非java应用以http形式调用。
// * User: zhouzhipeng
// * Date: 2017/7/27:12:10
// */
//@Path("demo")
//@com.alibaba.dubbo.config.annotation.Service
//public class DubboxWithRestDemoServiceImpl implements DubboDemoService {
//
//    @GET
//    @Path("/test")
//    @Produces(ContentType.TEXT_PLAIN_UTF_8)
//    @Override
//    public String test(Entity entity) {
//        return "test :"+entity.getName();
//    }
//}
