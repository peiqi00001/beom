package com.atguigu.blog.mapper;

import com.atguigu.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: 佩奇
 * @Date: 2023/10/25 11:26
 * @Version: 1.0
 * @Description:
 */
@Repository
@Mapper
public interface UserMapper {
    User findUserById(Long id);

    void updateUser(User user);
}
