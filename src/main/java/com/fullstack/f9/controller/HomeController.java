package com.fullstack.f9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String doGetHome(){
        return "/views/home";
    }
}
//Hoàng Hà f9