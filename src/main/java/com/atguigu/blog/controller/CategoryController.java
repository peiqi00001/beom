package com.atguigu.blog.controller;

import com.atguigu.blog.entity.Category;
import com.atguigu.blog.service.CategoryService;
import com.atguigu.blog.utils.Result;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:03
 * @Version: 1.0
 * @Description:分类CategoryController层
 */
@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
private CategoryService categoryService;

    /**
     * 获取所有分类列表
     * @return
     */
    @GetMapping("/findAll")
    public Result findAll() {
        List<Category> categories = categoryService.findAll();
        return Result.ok(categories);
    }
    /**
     * 模糊查询文章列表
     * @param name
     * @return
     */
    @GetMapping("/findListLikeName")
    public Result findListLikeName(String name) {
        List<Category> categories = categoryService.findListLikeName(name);
        return categories!= null&&categories.size() != 0 ? Result.ok(categories): Result.fail("未找到分类");
    }

    /**
     * 根据条件分页查询分类列表
     * @param page: 当前页数
     *@param limit:每页记录数
     *@param cname:分类名称
     * @return
     */
    @GetMapping("/findByPage")
    public Result findByPage(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "3") Integer limit, String cname) {
        PageInfo pageInfo = categoryService.findByPage(page, limit, cname);
        return Result.ok(pageInfo);
    }
    /**
     * 新增分类
     * @param category
     * @return
     * @return
     */
    @PostMapping("/insert")
    public Result insert(@RequestBody Category category) {
        categoryService.insert(category);
        return Result.ok();
    }

    /**
     * 修改分类
     * @param category
     * @return
     */
    @PutMapping("/update")
public Result update(@RequestBody Category category) {
    categoryService.update(category);
    return Result.ok();
}
    /**
     * 删除分类
     * @param id
     * @return
     */
    @DeleteMapping("/delete")
    public Result delete(Integer id){
        categoryService.delete(id);
        return Result.ok();
    }
}