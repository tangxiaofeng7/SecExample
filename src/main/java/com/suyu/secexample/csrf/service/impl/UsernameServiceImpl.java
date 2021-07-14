package com.suyu.secexample.csrf.service.impl;


import com.suyu.secexample.csrf.mapper.UserMapper;
import com.suyu.secexample.csrf.model.User;
import com.suyu.secexample.csrf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> addUser(User user) {
        return userMapper.addUser(user);
    }
}
