package com.example.demosecuritypractice.controller.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestRestController {

    @GetMapping("/user")
    public String helloUser() {
        return "Hello User.   <a href='http://localhost:8082/logout'>logout</a>";
    }
}
