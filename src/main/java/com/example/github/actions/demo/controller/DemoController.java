package com.example.github.actions.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    String hello() {
        return "Dummy Rest app";
    }
}
