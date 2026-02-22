package com.example.studentmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, this is my first REST API!";
    }
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot REST API!";
    }
    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        int sum = a + b;
        return "Sum is: " + sum;
    }
}
