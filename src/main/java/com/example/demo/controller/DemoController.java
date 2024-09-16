package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/hello-world")
public class DemoController{

    @Autowired
    private DemoService demoService;


    @GetMapping("/hello")
    public String helloWorld(){
        return demoService.helloWorld("Dev");
    }

    /**
     * @param id
     * @param filter
     * @param body
     * @return user name, id and selected filter
     */
    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable String id, @RequestParam(defaultValue="none") String filter, @RequestBody User body){
        return "Hello, " + body.getName() + " \n Your ID is ->> " + id
        +"\n and the filter is ->> " + filter;
    }

}