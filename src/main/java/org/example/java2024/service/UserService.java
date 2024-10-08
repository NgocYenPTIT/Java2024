package org.example.java2024.service;

import lombok.RequiredArgsConstructor;
import org.example.java2024.entity.User;
import org.example.java2024.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private  final UserRepository userRepository ;
    public List<Object[]> getHello() {
        return userRepository.custom();
    }
    public Boolean login(String username, String password) {
        if(username.equals("abc") && password.equals("123"))return true ;
        return  false ;
    }
}
