package com.example.helloworld.controller;

import com.example.helloworld.component.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageRestController {

    @Autowired
    private User user;

    MessageRestController(){
    }

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

    @PostMapping("hello")
    public String sayHelloBean(@RequestBody User user){
        this.user.firstName = user.firstName;
        this.user.lastName = user.lastName;
        return "Hello " + user.firstName +" "+user.lastName+" from BridgeLabs";

    }

}
