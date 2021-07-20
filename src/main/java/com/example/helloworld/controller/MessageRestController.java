package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageRestController {

    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello From BridgeLabs";
    }

    @GetMapping("/helloName")
    public String sayHelloMark(@RequestParam String name){
        return "Hello " + name;
    }
}
