package com.Taxi24Seven.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Taxi24Seven.DB.UserDB;

@Repository
public interface UserRepository extends JpaRepository<UserDB, Long> {
    @Query("SELECT u FROM UserDB u WHERE u.email = ?1")
    Optional<UserDB>  findByEmail(String email);


}
