package com.rbac.dao;

import com.rbac.entity.User;

import java.util.List;

/**
 * @author: zouzhihui
 * @date: 2016-08-18 17-32
 */
public interface UserDao {
    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);
}
