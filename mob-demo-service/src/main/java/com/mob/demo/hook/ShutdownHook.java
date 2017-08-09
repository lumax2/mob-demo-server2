package com.mob.demo.hook;

import com.mob.web.filter.ShutdownCallback;
import org.springframework.stereotype.Component;

/**
 * 关闭时的回调钩子，请在application.yml中开启:endpoints.shutdown.enabled: true
 * 并以post方式访问 http://ip:host/shutdown
 * 详情请参考actuator:  https://segmentfault.com/a/1190000004318360?_ea=568366
 * User: zhouzhipeng
 * Date: 2017/8/9:11:37
 */

@Component
public class ShutdownHook implements ShutdownCallback {
    @Override
    public void onShutDown() {
        System.out.println("=======> before shutdown");
    }
}
