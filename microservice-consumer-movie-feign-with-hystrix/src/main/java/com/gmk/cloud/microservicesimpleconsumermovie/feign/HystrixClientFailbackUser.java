package com.gmk.cloud.microservicesimpleconsumermovie.feign;

import com.gmk.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFailbackUser implements UserFeignClient {
    @Override
    public User findUserById(Long id) {
        User user=new User();
        user.setId(0L);
        return user;
    }
}
