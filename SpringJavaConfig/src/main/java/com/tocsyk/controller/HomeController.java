package com.tocsyk.controller;


import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping
    public String home() {
        return "home";
    }
}