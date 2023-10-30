package com.atguigu.blog.mapper;

import com.atguigu.blog.entity.Category;
import com.atguigu.blog.entity.User;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:26
 * @Version: 1.0
 * @Description:
 */

@Repository
@Mapper
public interface CategoryMapper {
    List<Category> findAll();


     List<Category> findListLikeName(String name) ;

    void insert(Category category);

    void delete(Integer id);

    void update(Category category);

}
