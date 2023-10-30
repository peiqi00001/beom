package com.atguigu.blog.service.impl;

import com.atguigu.blog.entity.User;
import com.atguigu.blog.mapper.UserMapper;
import com.atguigu.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:14
 * @Version: 1.0
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(Long id) {
        return userMapper.findUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public User login(User user) {
        User dbUser = userMapper.getByUsernameAndPassword(user);
        return dbUser;
    }

    @Override
    public List<User> findUserByUsername(String username) {
        return userMapper.findUserByUsername(username);
    }

    @Override
    public void register(User user) {
        userMapper.register(user);
    }
}