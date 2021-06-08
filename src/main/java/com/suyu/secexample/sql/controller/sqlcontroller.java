package com.suyu.secexample.sql.controller;


import com.github.pagehelper.PageInfo;
import com.suyu.secexample.sql.dao.User;
import com.suyu.secexample.sql.dao.pojo.UserQuery;
import com.suyu.secexample.sql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class sqlcontroller {

    @Autowired
    private UserService userService;

    @GetMapping("/sql")
    public String index(Model model, UserQuery userQuery){
        PageInfo<User> userPageInfo = userService.listUserByName(userQuery);
        model.addAttribute("page",userPageInfo);
        return "sql/sql";
    }

    @PostMapping("/sql")
    public String listUserByName(Model model,UserQuery userQuery){
        PageInfo<User> userPageInfo = userService.listUserByName(userQuery);
        model.addAttribute("page",userPageInfo);
        return "sql/sql";
    }
}
