package com.example.hellosbweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/he")
public class testSB {

    @RequestMapping("/test")
    public String test(){
        return "PHC";
    }
}
