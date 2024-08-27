package com.mengyicloud.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimuServiceController {

    @GetMapping("/simu")
    public String simu() {
        return "Hi, this is Simu";
    }
}
