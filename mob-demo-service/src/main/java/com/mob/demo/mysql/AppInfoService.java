//package com.mob.demo.mysql;
//
//import com.alibaba.dubbo.common.utils.CollectionUtils;
//import com.mob.demo.domain.App;
//import com.mob.demo.domain.AppExample;
//import com.mob.demo.mysql.mapper.AppMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
////import com.mob.demo.mapper.AppMapper;
//
///**
// * @author zhouzhipeng
// */
//@org.springframework.stereotype.Service
//public class AppInfoService {
//
//    @Autowired
//    private AppMapper appMapper;
//
//
//    public App getAppByAppKey(String appkey) {
//
//        AppExample ex = new AppExample();
//        ex.createCriteria().andAppkeyEqualTo(appkey);
//        List<App> apps = appMapper.selectByExample(ex);
//
//        App app = null;
//        if (CollectionUtils.isNotEmpty(apps)) {
//            app = apps.get(0);
//            app.setAppicon(app.getAppicon());
//
//        } else {
//            return null;
//        }
//        return null;
//    }
//
//}
