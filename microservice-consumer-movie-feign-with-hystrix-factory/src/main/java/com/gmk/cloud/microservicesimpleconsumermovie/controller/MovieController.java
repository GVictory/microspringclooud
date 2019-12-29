package com.gmk.cloud.microservicesimpleconsumermovie.controller;

import com.gmk.cloud.microservicesimpleconsumermovie.entity.User;
import com.gmk.cloud.microservicesimpleconsumermovie.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        return userFeignClient.findUserById(id);
    }
}
