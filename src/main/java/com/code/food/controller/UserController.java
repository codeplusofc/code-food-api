package com.code.food.controller;

import com.code.food.entity.UserEntity;
import com.code.food.repository.UserRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
