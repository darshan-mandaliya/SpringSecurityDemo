package com.springsecuritydemo.SpringSecurityDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

    @GetMapping("/")
    public String all() {
        return "Welcome All : Greetings from Spring Boot!";
    }
    
    @GetMapping("/user")
    public String user() {
        return "Welcome User";
    }
    
    @GetMapping("/admin")
    public String admin() {
        return "Welcome Admin";
    }

}