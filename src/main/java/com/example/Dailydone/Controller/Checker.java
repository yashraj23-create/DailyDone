package com.example.Dailydone.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class Checker {
    @GetMapping
    public String Showtext() {
        return "hey yeah baby";
    }
}
