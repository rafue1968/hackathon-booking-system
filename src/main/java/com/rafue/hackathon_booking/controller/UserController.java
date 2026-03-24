package com.rafue.hackathon_booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafue.hackathon_booking.model.User;
import com.rafue.hackathon_booking.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    // @GetMapping
    // public String testGet(){
    //     return "Use POST to create users";
    // }

    @PostMapping
    public String createUser(@RequestBody User user) throws Exception {
        return service.createUser(user);
    }
}