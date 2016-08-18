package com.rbac.dao;

import com.rbac.entity.Role;

import java.util.List;

/**
 * @author: zouzhihui
 * @date: 2016-08-18 17-30
 */
public interface RoleDao {
    public Role createRole(Role role);
    public Role updateRole(Role role);
    public void deleteRole(Long roleId);

    public Role findOne(Long roleId);
    public List<Role> findAll();
}
