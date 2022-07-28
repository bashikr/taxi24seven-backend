package com.Taxi24Seven.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingRoute {

    @RequestMapping("/")
    public String helloSpring() {
        return "Hello Spring";
    }
}