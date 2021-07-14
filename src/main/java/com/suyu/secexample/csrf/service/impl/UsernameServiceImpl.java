package com.suyu.secexample.csrf.service.impl;

import com.suyu.secexample.csrf.mapper.UsernameMapper;
import com.suyu.secexample.csrf.model.User;
import com.suyu.secexample.csrf.service.UsernameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsernameServiceImpl implements UsernameService {
    @Autowired
    private UsernameMapper usernameMapper;

    @Override
    public void addUser(User user) {
        usernameMapper.addUser(user);
    }
}
