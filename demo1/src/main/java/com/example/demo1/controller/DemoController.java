package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo1")
public class DemoController {

    @GetMapping(path = "/info")
    public String message() {
        return "BIENVENUE - DEMO 1";
    }
}
