package com.atguigu.blog.service.impl;

import com.atguigu.blog.entity.Category;
import com.atguigu.blog.mapper.CategoryMapper;
import com.atguigu.blog.service.CategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findAll() {
        return categoryMapper.findAll();
    }

    @Override
    public List<Category> findListLikeName(String name) {
        return categoryMapper.findListLikeName(name);
    }

    @Override
    public PageInfo findByPage(Integer page, Integer limit, String cname) {
        PageHelper.startPage(page, limit);
        List<Category> categories = categoryMapper.findListLikeName(cname);
        return new PageInfo(categories);

    }

    @Override
    public void insert(Category category) {
        categoryMapper.insert(category);
    }

    @Override
    public void delete(Integer id) {
        categoryMapper.delete(id);
    }

    @Override
    public void update(Category category) {
        categoryMapper.update(category);
    }
}