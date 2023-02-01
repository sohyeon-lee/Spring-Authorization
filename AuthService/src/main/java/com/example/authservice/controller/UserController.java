package com.example.authservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/login")
    public String authenticate() {
        return "hello";
    }
}
