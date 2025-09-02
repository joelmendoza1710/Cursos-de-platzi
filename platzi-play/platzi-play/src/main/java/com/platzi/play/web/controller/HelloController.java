package com.platzi.play.web.controller;

import com.platzi.play.domain.service.PlatziPlayAiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final PlatziPlayAiService iaservice;

    public HelloController(PlatziPlayAiService iaservice) {
        this.iaservice = iaservice;
    }

    @GetMapping("/hello")
    public  String hello(){
        return this.iaservice.generateGreeting();
    }

}
