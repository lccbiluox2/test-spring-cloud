package com.spring.cloud.node.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-03-24 11:52
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */

@SpringBootApplication
@EnableEurekaClient
public class UserConsumerApplication {

    public static void main(String[] args) {

        System.out.println("xx");
        SpringApplication.run(UserConsumerApplication.class, args);
    }

}
