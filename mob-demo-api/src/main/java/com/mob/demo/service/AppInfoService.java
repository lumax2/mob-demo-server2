package com.mob.demo.service;


import com.mob.demo.domain.App;

/**
 * @author panal
 * @since 2015/07/08
 */
public interface AppInfoService {

    public App getAppByAppKey(String appkey);

}
