package com.spring.cloud.node.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class EurekaServerNodeApplication {

	public static void main(String[] args) {
		System.out.println("xx");
		SpringApplication.run(EurekaServerNodeApplication.class, args);
	}

}
