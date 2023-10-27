package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String login() {
        return "login"; // for home.html
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/quiz")
    public String quiz() {
        return "quiz";
    }
}