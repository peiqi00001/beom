package com.atguigu.blog.controller;

import com.atguigu.blog.entity.Article;
import com.atguigu.blog.service.ArticleService;
import com.atguigu.blog.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 10:49
 * @Version: 1.0
 * @Description:文章controller层
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * 获取文章列表
     * @param cid
     * @return
     */
    @GetMapping("/findListByCid")
    public Result findListByCid(Long cid) {
        List<Article> articleList = articleService.findListByCid(cid);
        return Result.ok(articleList);
    }

    /**
     * 根据id获取文章信息
     * @param id
     * @return
     */
    @GetMapping("/getById")
    public Result getById(Long id) {
        Article article = articleService.getById(id);
        return Result.ok(article);
    }


    @PostMapping("/insert")
    public Result insert(@RequestBody Article article) {
        articleService.insert(article);
        return Result.ok();
    }

    /**
     * 删除文章
     * @param id
     * @return
     */
    @DeleteMapping("/delete")
    public Result delete(Integer id) {
        articleService.delete(id);
        return Result.ok();
    }

    /**
     * 修改文章
     * @param article
     * @return
     */
    @PutMapping("/update")
    public Result update(@RequestBody Article article) {
        articleService.update(article);
        return Result.ok();
    }

}