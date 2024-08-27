package com.mengyicloud.servicetwo.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class ServiceTwoController {

    @GetMapping("/index2")
    public String ServiceTwo(){
        return "This is ServiceTwo";
    }
}
