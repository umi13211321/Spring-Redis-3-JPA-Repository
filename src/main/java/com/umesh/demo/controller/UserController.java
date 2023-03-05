package com.umesh.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.umesh.demo.entity.User;
import com.umesh.demo.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/save_user")
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/get_user/{firstName}")
    public List<User> getUser(@PathVariable String firstName) {
        return userRepository.findByFirstName(firstName);
    }


    @GetMapping("/get_all_users")
    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }
}