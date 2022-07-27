package com.Taxi24Seven.configuration;


import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Taxi24Seven.DB.UserDB;
import com.Taxi24Seven.repositories.UserRepository;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner  commandLineRunner(UserRepository repository) {
        return args -> {
            UserDB admin = new UserDB(
                "admins",
                "admins",
                "bashar",
                "234",
                "test@tg.com",
                "123",
                "admin",
                LocalDate.now()
            );

            UserDB admin1 = new UserDB(
                "admin1",
                "admin1",
                "test",
                "234",
                "test@tg.com",
                "123",
                "admin",
                LocalDate.now()
            );

            repository.saveAll(
                List.of(admin, admin1)
            );
        };
    }
}
