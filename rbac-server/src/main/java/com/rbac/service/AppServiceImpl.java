package com.rbac.service;

import com.rbac.dao.AppDao;
import com.rbac.entity.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zouzhihui
 * @date: 2016-08-18 17-43
 */
@Service
public class AppServiceImpl implements AppService {
    @Autowired
    private AppDao appDao;

    public App createApp(App app) {
        return appDao.createApp(app);
    }

    public App updateApp(App app) {
        return appDao.updateApp(app);
    }

    public void deleteApp(Long appId) {
        appDao.deleteApp(appId);
    }

    public App findOne(Long appId) {
        return appDao.findOne(appId);
    }

    public List<App> findAll() {
        return appDao.findAll();
    }

    public Long findAppIdByAppKey(String appKey) {
        return appDao.findAppIdByAppKey(appKey);
    }
}
