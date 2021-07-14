package com.suyu.secexample.csrf.mapper;

import com.suyu.secexample.csrf.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    public List<User> addUser(User user);
}
