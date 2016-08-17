package com.rbac.remote;

import org.apache.shiro.session.Session;

import java.io.Serializable;

/**
 * Created by zouzhihui on 2016/8/17.
 */
public interface RemoteServiceInterface {

    public Session getSession(String appKey, Serializable sessionId);
    Serializable createSession(Session session);
    public void updateSession(String appKey, Session session);
    public void deleteSession(String appKey, Session session);
    public PermissionContext getPermissions(String appKey, String username);

}
