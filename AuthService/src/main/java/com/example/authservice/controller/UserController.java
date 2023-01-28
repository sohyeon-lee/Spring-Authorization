package com.example.authservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {

    @PostMapping("/signin")
    public String authenticate(@RequestHeader(value = "token") String token) {
        return "token is " + token;
    }
}
