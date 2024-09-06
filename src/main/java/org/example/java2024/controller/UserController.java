package org.example.java2024.controller;

import lombok.RequiredArgsConstructor;
import org.example.java2024.dto.UserFindGirlFrienddto;
import org.example.java2024.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private  final UserService userService ;
    @GetMapping("/test")
    List<Object[]> getMyInfo() {
        return this.userService.getHello() ;
    }
}
