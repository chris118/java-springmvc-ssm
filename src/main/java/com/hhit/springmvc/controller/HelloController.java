package com.hhit.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        System.out.println("Welcome to the DemoController!");
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "success!");
        return "hello";
    }
}