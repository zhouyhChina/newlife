package com.example.demo.controller;

import org.springframework.stereotype.Component;

@Component
@getter
public class User {
    private int age;
    public void say(){
        System.out.println("hello");
    }
}
