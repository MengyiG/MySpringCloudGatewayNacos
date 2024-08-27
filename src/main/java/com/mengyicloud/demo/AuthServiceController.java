package com.mengyicloud.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthServiceController {

    @GetMapping("/")
    public String home() {
        return "Hi, this is auth service";
    }
}
