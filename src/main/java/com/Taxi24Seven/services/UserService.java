package com.Taxi24Seven.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Taxi24Seven.DB.UserDB;
import com.Taxi24Seven.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDB> getUsers() {
        return userRepository.findAll();
    }
}