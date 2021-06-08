package com.suyu.secexample.cors.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class corscontroller {

    private static String info = "{\"敏感信息账号\": \"suyu\", \"敏感信息手机\": \"13888888888\"，\"敏感信息qq\": \"10010\", \"敏感信息身份证\": \"321222222222222222\", \"敏感信息地址\": \"网商路699号阿里巴巴园区\"}";

    /*
    * 这种配置非常危险，相当于任意网站可以直接跨域读取其资源内容。
    * */

//    使用CrossOrigin注解（局部跨域配置）
    @CrossOrigin(origins = {"*"})
    @GetMapping("/cors1")
    public String vuln1(HttpServletRequest request, HttpServletResponse response, Model model) {
        model.addAttribute("name",info);
        return "cors/cors";
    }

//    使用HttpServletResponse设置响应头(局部跨域配置)
    @GetMapping("/cors2")
    public String vuln2(HttpServletRequest request, HttpServletResponse response, Model model) {
//        response.setHeader("Access-Control-Allow-Origin", "http://suyu.com:8080");
        response.setHeader("Access-Control-Allow-Origin", "*");
        model.addAttribute("name",info);
        return "cors/cors";
}
}
