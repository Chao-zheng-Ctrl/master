package com.example.test.mapper;

import com.example.test.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> selectUserAll();
    @Select("select * from user where uid =${id}")
    User selectUserById( Integer id);
}
