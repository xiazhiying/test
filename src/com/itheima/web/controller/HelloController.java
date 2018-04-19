package com.itheima.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("test")
    public String test(Model model){
        String msg = "hello idea to spring mvc!!!";
        System.out.println(msg);
        model.addAttribute("msg",msg);
        return  "/WEB-INF/views/hello.jsp";
    }
}
