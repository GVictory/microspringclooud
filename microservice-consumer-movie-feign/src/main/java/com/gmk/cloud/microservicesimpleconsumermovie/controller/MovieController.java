package com.gmk.cloud.microservicesimpleconsumermovie.controller;

import com.gmk.cloud.microservicesimpleconsumermovie.entity.User;
import com.gmk.cloud.microservicesimpleconsumermovie.feign.FeignClient;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private FeignClient feignClient;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        return feignClient.findUserById(id);
    }
}
