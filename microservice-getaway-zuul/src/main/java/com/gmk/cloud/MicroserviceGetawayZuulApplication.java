package com.gmk.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicroserviceGetawayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceGetawayZuulApplication.class, args);
    }

}
