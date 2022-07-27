package com.Taxi24Seven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Taxi24Seven.configuration.AppProperties;

@EnableAutoConfiguration
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = { "com.Taxi24Seven.controllers",
        "com.Taxi24Seven.services",
        "com.Taxi24Seven.configuration",
        "com.Taxi24Seven.security",
        "com.Taxi24Seven.exception",
        "com.Taxi24Seven.util" })
@EnableJpaRepositories(basePackages = { "com.Taxi24Seven.repository" })
@EnableConfigurationProperties(AppProperties.class)
public class Taxi24SevenApplication {

    public static void main(String[] args) {
        SpringApplication.run(Taxi24SevenApplication.class, args);
    }
}
