package com.suyu.secexample.rce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Controller
public class rcecontroller {


    @RequestMapping("/rce")
    public String input(){
        return "rce/rce";
    }


    @PostMapping("/rceoutput")
    public String index(@RequestParam("command") String command, Model model){
        if(command=="" | command==null){
            command= "whoami";
        }
        Process p = null;
        String result = null;
        try {
            p = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream is = p.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String s = null;
        while (true) {
            try {
                if (!((s = reader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            result = s;
        }
        model.addAttribute("result",result);
        return "rce/rceoutput";
    }

}
