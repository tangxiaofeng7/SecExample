package com.suyu.secexample.fastjson.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.suyu.secexample.fastjson.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class fastjsoncontroller {

    @GetMapping("/fastjson")
    public String input(){

        User user = new User();
        user.setAge("18");
        user.setUsername("txf");
        String ser1 = JSON.toJSONString(user);
        System.out.println(ser1);
        String ser2 = JSON.toJSONString(user, SerializerFeature.WriteClassName);
        System.out.println(ser2);
        return "fastjson/fastjson";
    }

    @PostMapping("/fastjsonoutput")
    public String outputmessage(@RequestParam("data") String data, Model model){
        JSONObject ser2 = JSON.parseObject(data, Feature.SupportNonPublicField);
        JSONObject result = new JSONObject(ser2);
        result.put("18",ser2.get("name"));
        model.addAttribute("result",result);
        return "fastjson/fastjsonoutput";
    }
}
