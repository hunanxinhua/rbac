package com.rbac.dao;

import com.rbac.entity.Authorization;

import java.util.List;

/**
 * @author: zouzhihui
 * @date: 2016-08-18 16-28
 */
public interface AuthorizationDao {

    public Authorization createAuthorization(Authorization authorization);
    public Authorization updateAuthorization(Authorization authorization);
    public void deleteAuthorization(Long authorizationId);

    public Authorization findOne(Long authorizationId);
    public List<Authorization> findAll();

    public Authorization findByAppUser(Long appId, Long userId);

}
