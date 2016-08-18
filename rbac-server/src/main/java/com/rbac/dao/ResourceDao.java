package com.rbac.dao;

import com.rbac.entity.Resource;

import java.util.List;

/**
 * @author: zouzhihui
 * @date: 2016-08-18 17-28
 */
public interface ResourceDao {
    public Resource createResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(Long resourceId);

    Resource findOne(Long resourceId);
    List<Resource> findAll();
}
