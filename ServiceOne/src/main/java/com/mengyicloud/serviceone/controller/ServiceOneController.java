package com.mengyicloud.serviceone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

    @GetMapping("/index1")
    public String ServiceOne() {
        return "This is ServiceOne";
    }
}
