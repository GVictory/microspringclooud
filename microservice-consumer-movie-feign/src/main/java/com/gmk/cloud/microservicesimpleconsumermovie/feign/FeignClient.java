package com.gmk.cloud.microservicesimpleconsumermovie.feign;

import com.gmk.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.cloud.openfeign.FeignClient("microservice-provider-user")
public interface FeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/simple/{id}")
    User findUserById(@PathVariable("id") Long id);
}
