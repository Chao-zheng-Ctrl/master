package com.example.test.controller;

import com.example.test.pojo.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("zc")
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("test")
    public String  show(){
        return"hello";
    }
    @RequestMapping("user")
    public List<User> show2(){
        return userService.serletUserAll();
    }
    @RequestMapping("userById/{id}")
    public User userById(@PathVariable("id") Integer id){
        return userService.userById(id);
    }
}
