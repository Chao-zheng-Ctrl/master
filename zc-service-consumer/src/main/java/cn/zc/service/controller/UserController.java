package cn.zc.service.controller;


import cn.zc.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping("consumer/user")
public class UserController {
    @Autowired
    private  RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    public UserController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long id){
        List<ServiceInstance> instances = discoveryClient.getInstances("service-provide");
        ServiceInstance serviceInstance = instances.get(0);
        User forObject = this.restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/" + id, User.class);
        System.out.println(forObject);
        return forObject;
    }
}
