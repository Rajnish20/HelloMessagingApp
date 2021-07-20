package com.example.helloworld.component;

import org.springframework.stereotype.Component;

@Component
public class User {
    public String firstName;
    public String lastName;

    User(){

    }
     public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
     }
}
