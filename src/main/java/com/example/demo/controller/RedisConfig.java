package com.example.demo.controller;


import org.springframework.stereotype.Component;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
@Component
public class RedisConfig  {
    private User user;
    public  RedisConfig(User user){
        this.user=user;
    }
    public  void test(){
        System.out.println("user:"+user);
    }
    public static void main(String[] args) {

    }
}
