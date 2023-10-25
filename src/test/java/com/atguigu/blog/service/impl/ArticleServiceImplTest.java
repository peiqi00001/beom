package com.atguigu.blog.service.impl;

import com.atguigu.blog.entity.Article;
import com.atguigu.blog.service.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 15:28
 * @Version: 1.0
 * @Description:
 */
@SpringBootTest
class ArticleServiceImplTest {
@Autowired
private ArticleService articleService;
    @Test
    void findListByCid() {
        List<Article> articleList = articleService.findListByCid(2L);
        System.out.println("articleList = " + articleList);
    }
}