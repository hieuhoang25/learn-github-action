package com.hicode.backendkeycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello(){
        String s = null;
        assert s!=null : "khong duoc null";
        return "Hello, I am learning the keycloak";
    }
}
