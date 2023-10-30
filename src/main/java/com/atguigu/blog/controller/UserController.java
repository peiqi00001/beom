package com.atguigu.blog.controller;

import com.atguigu.blog.entity.User;
import com.atguigu.blog.service.UserService;
import com.atguigu.blog.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:04
 * @Version: 1.0
 * @Description:用户Controller层
 */
@CrossOrigin
@Tag(name = "用户模块")
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
    @Operation(summary = "根据id获取用户信息")
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
     * 登录
     * @param user
     * @return
     * 从应用域中获取username和 password
     */
    @PostMapping("/login")
    public Result login(@RequestBody User user) {
       User dbUser= userService.login(user);
       return dbUser!= null ? Result.ok(dbUser): Result.fail("登录失败！");
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @PutMapping("/register")
    public Result register(@RequestBody User user) {
        if (userService.findUserByUsername(user.getUsername()).size() != 0) {
            return Result.fail("该用户已存在！");
        }
        userService.register(user);
        return Result.ok();
    }
    }