package com.suyu.secexample.csrf.service;

import com.suyu.secexample.csrf.model.User;
import java.util.List;

public interface UserService {
    public List<User> addUser(User user);
}
