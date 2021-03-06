package com.spring.cloud.node.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user/data")
public class UserCenterController {
    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/getTodayStatistic/{id}")
    public Integer getTodayStatistic(@PathVariable("id") Integer id){

        // 使用discoveryClient 类能够与eureka server 交互， getInstances 获取注册到eureka server
        // 的"spring-cloud-order-service-provider" 实例列表

        List<ServiceInstance> instances = discoveryClient.getInstances("eureka-client");

        // 获取第一个服务信息

        int serviceId =(int)(Math.random()*2);
        ServiceInstance instanceInfo = instances.get(serviceId);
        //获取ip
        String ip = instanceInfo.getHost();
        //获取port
        int port = instanceInfo.getPort();
        String url  ="http://"+ip+":"+port+"/order/data/getTodayFinishOrderNum/"+id;
        return restTemplate.getForObject(url, Integer.class);
    }

    @GetMapping("/movie/{id}")
    public Integer findById(@PathVariable Long id) {
        // VIP: Virtual IP http://microservice-provider-user/即虚拟IP 服务提供者的ServiceId （spring.application.name）
//        String url = "http://lcc/eureka-client/order/data/getTodayFinishOrderNum/" + id;
//        String url = "http://localhost/eureka-client/order/data/getTodayFinishOrderNum/" + id;
//        String url = "http://eureka-client/ureka-client/order/data/getTodayFinishOrderNum/" + id;
//        String url = "http://hbuy-eureka/ureka-client/order/data/getTodayFinishOrderNum/" + id;
//        String url = "http://ureka-client/order/data/getTodayFinishOrderNum/" + id;
//        String url = "http://loclhost/ureka-client/order/data/getTodayFinishOrderNum/" + id;
//        String url = "http://lcc/ureka-client/order/data/getTodayFinishOrderNum/" + id;


//        String url = "http://UREKA-CLIENT/ureka-client/order/data/getTodayFinishOrderNum/" + id;
//        String url = "http://LOCLHOST/ureka-client/order/data/getTodayFinishOrderNum/" + id;
//        String url = "http://UREKA-CLIENT/order/data/getTodayFinishOrderNum/" + id;
        String url = "http://ureka-client/order/data/getTodayFinishOrderNum/" + id;
        System.out.println(url);
        return this.restTemplate.getForObject(url, Integer.class);
    }
}
