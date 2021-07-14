package com.suyu.secexample.csrf.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.suyu.secexample.csrf.model.User;
import com.suyu.secexample.csrf.service.UsernameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class csrfcontroller {
    User user = new User();
    @Autowired
    private UsernameService userService;

    @GetMapping("/csrf")
    public String input() {
        return "csrf/csrf";
    }

        @RequestMapping("/csrf")
    public String addUser(User user1, Model model) {
        user.setId(user1.getId());
        user.setName(user1.getName());
        user.setPwd(user1.getPwd());
        userService.addUser(user);
        return "csrf/csrf";
    }

}








