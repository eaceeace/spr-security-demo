package com.spr_security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Controller {
    @GetMapping
    public String getDemo() {
        return ("<h1>Spring security performed successfully!!</h1>");
    }
}
