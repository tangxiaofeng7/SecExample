package com.suyu.secexample.messageecho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Random;

@Controller
public class messagecontroller {

    int Code = 0;
    @GetMapping("/messageecho")
    public String index(){
        return "messageecho/messageecho";
    }

    @GetMapping("/messageecho/getcode")
    public String getcode(Model model){
        Random r = new Random();
        int number = r.nextInt(900000);
        model.addAttribute("code",number);
        System.out.println(number);
        Code =number;
        return "messageecho/messageechooutput";
    }

    @PostMapping("/messageecho/testcode")
    public String testcode(Integer code1,Model model){
        String result ="fail";
        if (code1 != null && code1 != 0 &&Code == code1){
            System.out.println(true);
            result ="sueecss";
        }
        model.addAttribute("code1",result);
        return "messageecho/messageechooutput";
    }
}