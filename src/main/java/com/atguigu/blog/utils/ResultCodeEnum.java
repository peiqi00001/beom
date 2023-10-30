package com.atguigu.blog.utils;

import lombok.Getter;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:33
 * @Version: 1.0
 * @Description:统一返回结果类
 */
@Getter
public enum ResultCodeEnum {
    SUCCESS(200,"成功٩(^ᴗ^)۶"),
    FAIL(201, "失败༼ಢ_ಢ༽"),;

    private Integer code;
    private String message;
    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}