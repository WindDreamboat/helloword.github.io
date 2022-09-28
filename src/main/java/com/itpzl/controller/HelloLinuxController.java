package com.itpzl.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloLinuxController {

    @GetMapping
    public String outString(){
        return "hello linux";
    }
}
