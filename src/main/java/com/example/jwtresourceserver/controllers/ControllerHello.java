package com.example.jwtresourceserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerHello {

    @GetMapping("/hello")
    public String heloo() {
        return "hello.html";
    }
}
