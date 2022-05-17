package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class Hello {

    @RequestMapping("/test")
    public String get(ModelMap model) {
        System.out.println("asdsdasasdasdasdasdasdasdsdas");
        return "index222";
    }

    @RequestMapping("/test2")
    public String test2(ModelMap model) {
        System.out.println("asdsdasasdasdasdasdasdasdsdas");
        return "index222";
    }

    @RequestMapping("/test3")
    public String test3(ModelMap model) {
        System.out.println("asdsdasasdasdasdasdasdasdsdas");
        return "index222";
    }

    @RequestMapping("/test4")
    public String test4(ModelMap model) {
        System.out.println("asdsdasasdasdasdasdasdasdsdas");
        return "index222";
    }
}
