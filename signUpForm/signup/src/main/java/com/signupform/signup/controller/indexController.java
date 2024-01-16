package com.signupform.signup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.signupform.signup.model.userInfo;

@Controller
public class indexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("register")
    public String userRegistration(@ModelAttribute userInfo user){
        return "index";
    }
}
