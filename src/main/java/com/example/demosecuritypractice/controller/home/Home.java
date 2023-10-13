package com.example.demosecuritypractice.controller.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping
    public String hello() {
        return "Hello Home <a href='http://localhost:8082/test/user'>User</a> ";
    }
}
