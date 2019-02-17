package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CommonController {
    @RequestMapping("/index")
    public String index(Model model){
        List<String> list = new ArrayList<>();
        list.add("liu");
        list.add("jia");
        model.addAttribute("list",list);
        model.addAttribute("name","刘佳晨");
        return "index";
    }
}
