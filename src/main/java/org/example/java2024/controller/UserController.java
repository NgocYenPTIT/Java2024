package org.example.java2024.controller;

import lombok.RequiredArgsConstructor;
import org.example.java2024.entity.User;
import org.example.java2024.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/test")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
