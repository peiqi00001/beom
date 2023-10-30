package com.atguigu.blog.service;

import com.atguigu.blog.entity.User;

import java.util.List;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:09
 * @Version: 1.0
 * @Description:
 */
public interface UserService {
    User findUserById(Long id);

    void updateUser(User user);

    User login(User user);

    List<User> findUserByUsername(String username);

    void register(User user);
}
