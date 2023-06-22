package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hellocontroller {

    @GetMapping("")
    public String hello(){
        System.out.println("hello world8");
        return "ok8";
    }

}
