package com.atguigu.blog.service;

import com.atguigu.blog.entity.Category;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:09
 * @Version: 1.0
 * @Description:
 */
public interface CategoryService {

    List<Category> findAll();

    List<Category> findListLikeName(String name);

    PageInfo findByPage(Integer page, Integer limit, String cname);

    void insert(Category category);

    void delete(Integer id);

    void update(Category category);
}