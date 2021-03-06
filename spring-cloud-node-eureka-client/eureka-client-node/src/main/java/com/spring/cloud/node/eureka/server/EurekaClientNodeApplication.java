package com.spring.cloud.node.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class EurekaClientNodeApplication {

	public static void main(String[] args) {
		System.out.println("xx");
		SpringApplication.run(EurekaClientNodeApplication.class, args);
	}

}
