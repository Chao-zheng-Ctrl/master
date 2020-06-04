package com.zc.service.service;

import com.zc.service.mapper.UserMapper;
import com.zc.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;
    public User queryUserById(Long uid){
        return this.userMapper.selectByPrimaryKey(uid);
    }

    public List<User> selectAll() {
        List<User> userList = userMapper.selectAll();
        return userList;
    }
}
