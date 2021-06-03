package com.suyu.secexample.sql.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suyu.secexample.sql.dao.User;
import com.suyu.secexample.sql.dao.pojo.UserQuery;
import com.suyu.secexample.sql.mapper.UserMapper;
import com.suyu.secexample.sql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }

    @Override
    public PageInfo<User> listUserByName(UserQuery userQuery) {
        PageHelper.startPage(userQuery.getPageNum(),userQuery.getPageSize());
        return new PageInfo<User>(userMapper.listUserByName(userQuery));
    }
}