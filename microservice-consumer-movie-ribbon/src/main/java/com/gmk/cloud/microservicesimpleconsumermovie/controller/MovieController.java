package com.gmk.cloud.microservicesimpleconsumermovie.controller;

import com.gmk.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        return  restTemplate.getForObject("http://microservice-provider-user/simple/"+id,User.class);
    }

    @GetMapping("/test")
    public String test(){
        ServiceInstance serviceInstance=loadBalancerClient.choose("microservice-provider-user");
        System.out.println(serviceInstance.getHost()+"-"+serviceInstance.getPort()+"-"+serviceInstance.getServiceId());
        ServiceInstance serviceInstance1=loadBalancerClient.choose("microservice-provider-user2");
        System.out.println(serviceInstance1.getHost()+"-"+serviceInstance1.getPort()+"-"+serviceInstance1.getServiceId());
        return "1";
    }
}
