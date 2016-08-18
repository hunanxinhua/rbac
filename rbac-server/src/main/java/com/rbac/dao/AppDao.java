package com.rbac.dao;

import com.rbac.entity.App;

import java.util.List;

/**
 * @author: zouzhihui
 * @date: 2016-08-18 16-14
 */
public interface AppDao {

    public App createApp(App app);
    public App updateApp(App app);
    public void deleteApp(Long appId);

    public App findOne(Long appId);
    public List<App> findAll();

    Long findAppIdByAppKey(String appKey);

}
