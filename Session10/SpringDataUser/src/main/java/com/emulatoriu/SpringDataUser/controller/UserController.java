package com.emulatoriu.SpringDataUser.controller;

import com.emulatoriu.SpringDataUser.data.User;
import com.emulatoriu.SpringDataUser.logic.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping
    @RequestMapping("{id}")
    User find(@PathVariable String id) {
        return userService.find(id);
    }

    @GetMapping
    @RequestMapping("firstname/{firstname}")
    User findByFirstname(@PathVariable String firstname) {
        return userService.findByFirstname(firstname);
    }
}
