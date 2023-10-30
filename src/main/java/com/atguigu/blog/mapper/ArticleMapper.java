package com.atguigu.blog.mapper;

import com.atguigu.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:26
 * @Version: 1.0
 * @Description:
 */

@Repository
@Mapper

public interface ArticleMapper {
    List<Article> findListByCid(Long cid);

    Article getById(Long id);

    void insert(Article article);

    void delete(Integer id);

    void update(Article article);
}
