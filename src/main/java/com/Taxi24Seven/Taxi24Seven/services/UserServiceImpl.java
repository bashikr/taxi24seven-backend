package com.Taxi24Seven.Taxi24Seven.services;

import java.time.LocalDate;
import java.util.List;


import org.springframework.stereotype.Service;

import com.Taxi24Seven.Taxi24Seven.db.User;

@Service
public class UserServiceImpl implements UserService {
    public List<User> getUsers() {
        return List.of(
                new User(
                        1L,
                        "John",
                        "Doe",
                        "bashikr",
                        "123",
                        "bashikr@gmail.com",
                        "123",
                        "admin",
                        LocalDate.now()

                ));
    }
}