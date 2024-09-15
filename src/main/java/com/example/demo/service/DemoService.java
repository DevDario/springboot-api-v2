package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService{

    public String helloWorld(String name){
        return "Hello " + name + " !";
    }
}