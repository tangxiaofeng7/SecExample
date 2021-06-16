package com.suyu.secexample.fastjson.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.suyu.secexample.fastjson.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class fastjsoncontroller {

    @GetMapping("/fastjson")
    public String input(){
//
//        User user = new User();
//        user.setAge("18");
//        user.setUsername("txf");
//        String ser1 = JSON.toJSONString(user);
//        System.out.println(ser1);
//        String ser2 = JSON.toJSONString(user, SerializerFeature.WriteClassName);
//        System.out.println(ser2);
        return "fastjson/fastjson";
    }

    User user = new User();

    @RequestMapping ("fastjson")
    public String fastjson1(@RequestBody String jsonData, Model model) {
            JSONObject jsonObject = JSON.parseObject(jsonData);
            user.setAge(jsonObject.get("age").toString());
            user.setUsername(jsonObject.get("username").toString());
            model.addAttribute("result",user);
        return "fastjson/fastjsonoutput";
        }

    @RequestMapping ("fastjson2")
    public String fastjson2( Model model) {
        model.addAttribute("result",user);
        return "fastjson/fastjsonoutput";
    }
}
