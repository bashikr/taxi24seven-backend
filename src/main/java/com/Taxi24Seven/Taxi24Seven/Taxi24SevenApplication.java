package com.Taxi24Seven.Taxi24Seven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.Taxi24Seven.rest.controller"} )
public class Taxi24SevenApplication {

    public void tests() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        SpringApplication.run(Taxi24SevenApplication.class, args);
    }

}
