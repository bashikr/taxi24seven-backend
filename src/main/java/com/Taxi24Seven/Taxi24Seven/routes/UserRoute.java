package com.Taxi24Seven.Taxi24Seven.routes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Taxi24Seven.Taxi24Seven.db.User;
import com.Taxi24Seven.Taxi24Seven.services.UserService;

@RestController
@RequestMapping("/user")
public class UserRoute {
    private final UserService userService;

    @Autowired
    public UserRoute(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }
}