package com.rafue.hackathon_booking.service;

import org.springframework.stereotype.Service;

import com.rafue.hackathon_booking.model.User;
import com.rafue.hackathon_booking.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public String createUser(User user) throws Exception {
        return repo.save(user);
    }
}
