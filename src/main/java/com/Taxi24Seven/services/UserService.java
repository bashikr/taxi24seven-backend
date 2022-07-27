package com.Taxi24Seven.services;

import java.util.List;
import java.util.Optional;

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

    public void addNewUser(UserDB userDB) {
        Optional<UserDB> userOptional = userRepository.findByEmail(userDB.getEmail());

        if (userOptional.isPresent()) {
            throw new IllegalStateException("User already exists");
        }
        userRepository.save(userDB);
    }
}