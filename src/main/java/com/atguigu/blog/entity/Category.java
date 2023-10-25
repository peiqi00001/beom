package com.atguigu.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 10:43
 * @Version: 1.0
 * @Description:分类实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    private Long cid;
    private String cname; //分类名称
    private Date create_time;
    private Date update_time;

}