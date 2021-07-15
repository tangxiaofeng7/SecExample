package com.suyu.secexample.xxe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class xxecontroller {

    @GetMapping("/xxe")
    public String input(){
        return "xxe/xxe";
    }

}
