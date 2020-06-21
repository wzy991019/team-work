package com.service.impl;

import com.dao.UserMapper;
import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String uname, String upwd) {
        return userMapper.login(uname, upwd);
    }

    @Override
    public Integer isUsername(String uname) {
        return userMapper.isUsername(uname);
    }

    @Override
    public User isPassword(String uname) {
        return userMapper.isPassword(uname);
    }

    @Override
    public Integer Register(User user) {
        return userMapper.Register(user);
    }
}
