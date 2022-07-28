package com.Taxi24Seven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.Taxi24Seven.configuration.AppProperties;

@EnableAutoConfiguration
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableConfigurationProperties(AppProperties.class)
public class Taxi24SevenApplication {

    public static void main(String[] args) {
        SpringApplication.run(Taxi24SevenApplication.class, args);
    }
}
