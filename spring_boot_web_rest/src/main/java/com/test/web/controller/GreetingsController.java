package com.test.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class GreetingsController {

    @RequestMapping("/greeting")
    public String greetings(){
        String greet = "Hellow World its %s";
        return String.format(greet, (new Date()).toString());
    }
}
