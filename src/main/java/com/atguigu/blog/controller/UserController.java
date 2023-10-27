package com.atguigu.blog.controller;

import com.atguigu.blog.entity.User;
import com.atguigu.blog.service.UserService;
import com.atguigu.blog.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:04
 * @Version: 1.0
 * @Description:用户Controller层
 */
@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
    private UserService userService;

    /**
     * 通过id获取用户信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result findUserById(@PathVariable Long id) {
        User user = userService.findUserById(id);
        return Result.ok(user);
    }

    /**
     * 用户信息修改
     * @param user
     * @return
     */
    @PutMapping("/update")
    public Result updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return Result.ok(user);
    }
    /**
     * - 业务说明:
     *   - 当用户发布文章时,应该先登录,如果已经登录,则跳转后端页面.
     *   - 要求用户输入用户名和密码不能为null,之后发送给服务器进行校验
     *   - 校验时,应该将密码进行加密处理. MD5加密
     *   - 如果登录成功之后,应该返回用户信息uid和name
     *   - 之后前端接收到用户信息之后,将数据保存到Cookie中. 方便以后校验使用.
     * - URL地址:
     *   - http://localhost:8001/user/login
     * - 请求类型:  post
     */
    @PutMapping("/login")
    public Result login(Long uid,String username) {
        return Result.ok("uid:3  name:admin");
    }
}