package com.gmk.cloud.microservicesimpleconsumermovie.feign;

import com.gmk.cloud.microservicesimpleconsumermovie.entity.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFactoryUser implements FallbackFactory<UserFeignClient> {

    private static final Logger logger= LoggerFactory.getLogger(HystrixClientFactoryUser.class);

    @Override
    public UserFeignClient create(Throwable throwable) {
        logger.info("logger is :",throwable.getMessage());
        return (UserFeignClientWithFactory) id -> {
            User user=new User();
            user.setId(-1L);
            return user;
        };
    }
}
