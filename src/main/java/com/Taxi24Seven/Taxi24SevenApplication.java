package com.Taxi24Seven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = { "com.Taxi24Seven.controllers", "com.Taxi24Seven.services" })
@EnableJpaRepositories(basePackages = { "com.Taxi24Seven.repositories" })
public class Taxi24SevenApplication {

    public static void main(String[] args) {
        SpringApplication.run(Taxi24SevenApplication.class, args);
    }
}
