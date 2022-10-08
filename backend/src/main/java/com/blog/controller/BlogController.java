package com.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/blog")
public class BlogController {

    @GetMapping(value = "test")
    public String test() {
        return "Hello from the Blog Controller!";
    }
    
}
