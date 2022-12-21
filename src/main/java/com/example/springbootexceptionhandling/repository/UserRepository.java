package com.example.springbootexceptionhandling.repository;

import com.example.springbootexceptionhandling.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}