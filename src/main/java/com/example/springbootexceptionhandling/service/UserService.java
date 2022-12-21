package com.example.springbootexceptionhandling.service;

import com.example.springbootexceptionhandling.handler.UserNotFoundException;
import com.example.springbootexceptionhandling.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Object userList() {
        return userRepository.findAll();
    }

    public Object userById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }

}
