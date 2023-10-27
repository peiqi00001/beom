package com.atguigu.blog.service;

import com.atguigu.blog.entity.User;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:09
 * @Version: 1.0
 * @Description:
 */
public interface UserService {
    User findUserById(Long id);

    void updateUser(User user);
}
