package com.spring.cloud.node.eureka.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-03-24 09:18
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
@Configuration
public class RestTemplateConfiguration {
    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}