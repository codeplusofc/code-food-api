package com.code.food.controller;

import com.code.food.dto.InUser;
import com.code.food.dto.OutUser;
import com.code.food.entity.UserEntity;
import com.code.food.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public OutUser createUser(@RequestBody InUser inUser) {
        return userService.createUser(inUser);
    }

    @GetMapping
    public List<UserEntity> findAllUsers() {
        return userService.findAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @GetMapping("/{id}")
    public Optional<UserEntity> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

}
