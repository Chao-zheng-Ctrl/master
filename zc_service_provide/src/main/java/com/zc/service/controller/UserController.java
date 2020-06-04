package com.zc.service.controller;

import com.zc.service.pojo.User;
import com.zc.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("{id}")
    public String queryUserById(@PathVariable("id")Long id,Model model){
        User user = userService.queryUserById(id);
        model.addAttribute("user",user);
        return "index";
    }
    @RequestMapping("all")
    public String all(Model model){
       List<User> userList= userService.selectAll();
       model.addAttribute("userList",userList);
        return "index";
    }
}
