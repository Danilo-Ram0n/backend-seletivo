package com.example.backendseletivo.controller;

import com.example.backendseletivo.entity.User;
import com.example.backendseletivo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return (User) userService.create(user);
    }

    @GetMapping
    public List<User> list() {
        return userService.list();
    }

    @PutMapping
    public List<User> update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("{id}")
    public List<User> delete(@PathVariable("id") Long id) {
        return userService.delete(id);
    }
}
