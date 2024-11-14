package org.example.java2024.service;

import lombok.RequiredArgsConstructor;
import org.example.java2024.Repository.UserRepository;
import org.example.java2024.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
