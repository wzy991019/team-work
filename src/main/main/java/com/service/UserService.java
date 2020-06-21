package com.service;

import com.model.User;

public interface UserService {
    //登录，根据用户名和密码
    User login(String uname, String upwd);

    //判断用户是否存在
    Integer isUsername(String uname);

    //判断用户名对应的密码是否正确
    User isPassword(String uname);

    // 用户注册
    Integer Register(User user);
}
