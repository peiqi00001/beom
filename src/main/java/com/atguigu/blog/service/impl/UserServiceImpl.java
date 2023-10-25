package com.atguigu.blog.service.impl;

import com.atguigu.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:14
 * @Version: 1.0
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserService userService;
}