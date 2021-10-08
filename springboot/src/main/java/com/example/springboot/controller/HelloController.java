package com.example.springboot.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.Transient;

@Controller
//@ConditionalOnBean(HttpRequest.class)
public class HelloController {


    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }

    @GetMapping("/hello2")
    public String hello(){
        return "HelloWorld2";
    }
}
