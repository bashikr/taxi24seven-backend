package com.Taxi24Seven.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Taxi24Seven.DB.UserDB;
import com.Taxi24Seven.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired //search by type
    // @Qualifier("userService") //search by name
    private final UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDB> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public void postUsers(@RequestBody UserDB userDB) {
        userService.addNewUser(userDB);
    }
}