package com.example.test.redis;

import com.example.test.TestApplication;
import com.example.test.pojo.User;
import com.example.test.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class UserRedis {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Autowired
    private UserService userService;
    @Test
    public void test() throws JsonProcessingException {
        String userListJosn = redisTemplate.boundValueOps("serletUserAll").get();
        System.out.println(userListJosn);
        if (null==userListJosn){
            List<User> users = userService.serletUserAll();
            ObjectMapper objectMapper=new ObjectMapper();

              userListJosn = objectMapper.writeValueAsString(users);
                redisTemplate.boundValueOps("serletUserAll").set(userListJosn);
                System.out.println("========数据库======"+userListJosn);

        }else{
            System.out.println("=======redis======="+userListJosn);
        }

    }
}
