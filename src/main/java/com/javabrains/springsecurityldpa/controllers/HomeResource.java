package com.javabrains.springsecurityldpa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource{

    @GetMapping("/")
    public String index(){
        return "Welcome Home";
    }
    
}