package com.atguigu.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 10:49
 * @Version: 1.0
 * @Description:文章controller层
 */
@RestController
@RequestMapping("/article ")
public class ArticleController {
@Autowired
    private ArticleController articleController;
}