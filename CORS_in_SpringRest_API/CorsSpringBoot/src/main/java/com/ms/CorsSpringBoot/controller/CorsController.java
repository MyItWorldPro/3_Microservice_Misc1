package com.ms.CorsSpringBoot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cors")
public class CorsController {

    @GetMapping("/getHelloWorldApi")
    public String helloWorldApi() {
        return "Hello World! from CorsController";
    }

}
