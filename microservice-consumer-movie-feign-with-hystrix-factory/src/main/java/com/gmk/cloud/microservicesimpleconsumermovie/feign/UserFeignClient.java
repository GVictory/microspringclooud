package com.gmk.cloud.microservicesimpleconsumermovie.feign;

import com.gmk.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "microservice-provider-user" , fallbackFactory = HystrixClientFactoryUser.class)
public interface UserFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/simple/{id}")
    User findUserById(@PathVariable("id") Long id);
}
