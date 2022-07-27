package com.Taxi24Seven.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Taxi24Seven.model.User;
import com.Taxi24Seven.services.UserService;
import com.Taxi24Seven.exception.ResourceNotFoundException;
import com.Taxi24Seven.repository.UserRepository;
import com.Taxi24Seven.security.CurrentUser;
import com.Taxi24Seven.security.UserPrincipal;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
public class UserController {
    @Autowired
    private final UserService userService;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("users")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
