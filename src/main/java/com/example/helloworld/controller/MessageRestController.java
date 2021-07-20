package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/helloPath/{name}")
    public String sayHelloPath(@PathVariable String name){
        return "Hello " + name +" from BridgeLabs";
    }
}
