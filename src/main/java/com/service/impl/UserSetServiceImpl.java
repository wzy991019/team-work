package com.service.impl;

import com.dao.UserSetMapper;
import com.model.User;
import com.service.UserSetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserSetServiceImpl implements UserSetService {

    @Resource
    private UserSetMapper userSetMapper;

    @Override
    public List<User> showUserInfo(String username) {

        return userSetMapper.showUserInfo(username);
    }
}
