package com.Taxi24Seven.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloSpring {

    @RequestMapping("/hello")
    public String helloSpring() {
        return "Hello Spring";
    }
}