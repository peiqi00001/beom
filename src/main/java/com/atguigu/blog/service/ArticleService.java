package com.atguigu.blog.service;

import com.atguigu.blog.entity.Article;

import java.util.List;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:07
 * @Version: 1.0
 * @Description:
 */
public interface ArticleService {
    List<Article> findListByCid(Long cid);

    Article getById(Long id);

    void insert(Article article);

    void delete(Integer id);

    void update(Article article);

}
