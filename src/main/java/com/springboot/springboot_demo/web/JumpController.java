package com.springboot.springboot_demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JumpController {
    @GetMapping(value = "/list")
    public String listCategory(){
        return "/listCategory";
    }
    @GetMapping(value = "/login")
    public String login(){
        return "/login";
    }
}
