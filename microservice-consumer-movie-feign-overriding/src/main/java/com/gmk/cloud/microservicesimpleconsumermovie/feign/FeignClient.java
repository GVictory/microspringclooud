package com.gmk.cloud.microservicesimpleconsumermovie.feign;

import com.gmk.cloud.microservicesimpleconsumermovie.config.UserFeignConfiguration;
import com.gmk.cloud.microservicesimpleconsumermovie.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.cloud.openfeign.FeignClient(name = "microservice-provider-user",configuration = UserFeignConfiguration.class)
public interface FeignClient {
    @RequestLine("GET /simple/{id}")
    User findUserById(@Param("id") Long id);
}