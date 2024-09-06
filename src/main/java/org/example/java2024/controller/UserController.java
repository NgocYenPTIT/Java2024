package org.example.java2024.controller;

import lombok.RequiredArgsConstructor;
import org.example.java2024.service.AuthenicationService;
import org.example.java2024.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private  final UserService userService ;
    private  final AuthenicationService authenicationService ;
    @GetMapping("/test")
    String getMyInfo() {
        return "hello" ;
    }

    @PostMapping("/login")
    String login(@RequestBody Map<String, String> body) {
        String username = body.get("username");
        String password = body.get("password");
        System.out.println(username + " " + password );
        return this.authenicationService.authenticate(username, password);
    }
}
