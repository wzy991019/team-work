package com.dao;

import com.model.User;

import java.util.List;

public interface UserSetMapper {
    List<User> showUserInfo(String username);

    List<User> queryUser(String field, Object val);
}
