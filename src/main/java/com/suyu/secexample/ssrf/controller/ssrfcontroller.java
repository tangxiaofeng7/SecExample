package com.suyu.secexample.ssrf.controller;

import com.suyu.secexample.ssrf.utils.HttpTool;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ssrfcontroller {

    @GetMapping("/ssrf")
    public String index(){
        return "ssrf/ssrf";
    }

    @PostMapping("/ssrfoutput")
    public String index(@RequestParam("url") String url, Model model){
        String result = null;
        try {
            result = String.valueOf(HttpTool.getHttpReuest(String.valueOf(url)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("result",result);
        return "ssrf/ssrfoutput";
    }
}
