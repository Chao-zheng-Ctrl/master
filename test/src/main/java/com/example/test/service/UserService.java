package com.example.test.service;

import com.example.test.mapper.UserMapper;
import com.example.test.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> serletUserAll() {
        return userMapper.selectUserAll();
    }

    public User userById(Integer id) {
        return userMapper.selectUserById(id);
    }
}
