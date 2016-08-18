package com.rbac.service;

import com.rbac.entity.App;

import java.util.List;

/**
 * @author: zouzhihui
 * @date: 2016-08-18 17-38
 */
public interface AppService {
    public App createApp(App app);
    public App updateApp(App app);
    public void deleteApp(Long appId);

    public App findOne(Long appId);
    public List<App> findAll();

    /**
     * 根据appKey查找AppId
     * @param appKey
     * @return
     */
    public Long findAppIdByAppKey(String appKey);
}
