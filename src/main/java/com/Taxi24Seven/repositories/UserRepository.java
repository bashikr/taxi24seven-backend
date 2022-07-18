package com.Taxi24Seven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Taxi24Seven.DB.UserDB;

@Repository
public interface UserRepository extends JpaRepository<UserDB, Long> {
}
