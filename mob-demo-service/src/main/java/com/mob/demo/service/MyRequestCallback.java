package com.mob.demo.service;

import com.mob.web.reqcallback.RequestCallback;
import org.springframework.stereotype.Service;

/**
 * TODO:写描述
 * User: zhouzhipeng
 * Date: 2017/10/31:10:56
 */
@Service
public class MyRequestCallback implements RequestCallback {
    @Override
    public void beforeRequest(Request request) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("before request");
        System.out.println(request);
    }

    @Override
    public void afterRequest(Request request, Response response) {
        System.out.println("afterRequest request");

        System.out.println(request);

        System.out.println(response);
    }
}
