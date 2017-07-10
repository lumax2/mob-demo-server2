package com.mob.demo.service.impl;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.mob.demo.domain.App;
import com.mob.demo.domain.AppExample;
//import com.mob.demo.mapper.AppMapper;
import com.mob.demo.service.AppInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouzhipeng
 */
@org.springframework.stereotype.Service
public class AppInfoServiceImpl implements AppInfoService {

//    @Autowired
//    private AppMapper appMapper;


    @Override
    public App getAppByAppKey(String appkey) {

        AppExample ex = new AppExample();
        ex.createCriteria().andAppkeyEqualTo(appkey);
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
        return null;
    }

}
