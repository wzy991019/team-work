package com.dao;

import com.model.User;
import com.model.UserStatus;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //    登录，验证用户名和密码
    User login(@Param("uname") String uname, @Param("upwd") String upwd);

    // 验证用户名是否存在
    Integer isUsername(@Param("uname") String uname);

    // 验证用户名对应的密码是否正确
    User isPassword(@Param("uname") String uname);

    // 用户注册
    Integer Register(User user);

    //判断用户状态：启用或禁用
    UserStatus checkUserStatus(String uname);
}
