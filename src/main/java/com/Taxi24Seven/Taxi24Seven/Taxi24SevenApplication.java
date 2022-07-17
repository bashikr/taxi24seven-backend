package com.Taxi24Seven.Taxi24Seven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = { "com.Taxi24Seven.Taxi24Seven" })
public class Taxi24SevenApplication {

    public static void main(String[] args) {
        SpringApplication.run(Taxi24SevenApplication.class, args);
    }

}
