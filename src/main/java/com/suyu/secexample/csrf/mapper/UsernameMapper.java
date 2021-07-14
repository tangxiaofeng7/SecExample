package com.suyu.secexample.csrf.mapper;

import com.suyu.secexample.csrf.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UsernameMapper {
    public void addUser(User user);
}
