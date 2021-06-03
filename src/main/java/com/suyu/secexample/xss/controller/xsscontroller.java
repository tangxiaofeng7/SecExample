package com.suyu.secexample.xss.controller;


import com.suyu.secexample.xss.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class xsscontroller {

    @GetMapping("/home")
    public String index() {
        return "index";
    }

    @GetMapping ("/xss")
    public String input(){
        return "xss";
    }

    @PostMapping ("/xssoutput")
    public String outputmessage(@RequestParam("name") String name, Model model){
        Person person = new Person(name);
        model.addAttribute("myperson",person);
        return "xssoutput";
    }

}
