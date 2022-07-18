package com.Taxi24Seven.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingRoute {

    @RequestMapping("/")
    public String helloSpring() {
        return "Hello Spring";
    }
}