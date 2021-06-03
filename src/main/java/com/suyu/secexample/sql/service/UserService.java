package com.suyu.secexample.sql.service;

import com.github.pagehelper.PageInfo;
import com.suyu.secexample.sql.dao.User;
import com.suyu.secexample.sql.dao.pojo.UserQuery;


import java.util.List;

public interface UserService {

     public List<User> listUser();

     public PageInfo<User> listUserByName(UserQuery userQuery);
}
