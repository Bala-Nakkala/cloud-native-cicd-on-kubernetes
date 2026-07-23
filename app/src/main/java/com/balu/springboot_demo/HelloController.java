package com.balu.springboot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello from UFC!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from UFC!";
    }
}