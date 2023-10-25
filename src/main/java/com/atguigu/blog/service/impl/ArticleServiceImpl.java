package com.atguigu.blog.service.impl;

import com.atguigu.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:11
 * @Version: 1.0
 * @Description:
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleService articleService;
}