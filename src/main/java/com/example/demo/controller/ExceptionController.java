package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ExceptionController {

    @RequestMapping("/zeroException")
    public String zeroException(){
        //int a = 1/0;
        return "/test";
    }
}
