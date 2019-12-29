package com.gmk.cloud.microservicesimpleconsumermovie.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserFeignConfiguration {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

}
