package com.suyu.secexample.sql.mapper;

import com.suyu.secexample.sql.dao.User;
import com.suyu.secexample.sql.dao.pojo.UserQuery;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    public List<User> listUser();

    public List<User> listUserByName(UserQuery userQuery);
}
