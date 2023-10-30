package com.atguigu.blog.service.impl;

import com.atguigu.blog.entity.Article;
import com.atguigu.blog.mapper.ArticleMapper;
import com.atguigu.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:11
 * @Version: 1.0
 * @Description:
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public List<Article> findListByCid(Long cid) {
        return articleMapper.findListByCid(cid);
    }

    @Override
    public Article getById(Long id) {
        return articleMapper.getById(id);
    }

    @Override
    public void insert(Article article) {
        articleMapper.insert(article);
    }

    @Override
    public void delete(Integer id) {
        articleMapper.delete(id);
    }

    @Override
    public void update(Article article) {
        articleMapper.update(article);
    }
}