package com.atguigu.blog.exception;

import com.atguigu.blog.utils.Result;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: 佩奇
 * @Date: 2023/10/27 14:17
 * @Version: 1.0
 * @Description:
 */
@ControllerAdvice
public class ExceptionOperation {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.fail().message("出错了呀o(〒﹏〒)o怎么办啊( ╥ω╥ )");
    }
}