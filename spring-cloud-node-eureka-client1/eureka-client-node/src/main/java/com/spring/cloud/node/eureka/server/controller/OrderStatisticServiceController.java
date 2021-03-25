package com.spring.cloud.node.eureka.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-03-25 12:13
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
@RestController
@RequestMapping("/order/data")
public class OrderStatisticServiceController {
    @Value("${server.port}")
    private Integer port;
    /**
     * 根据用户id获取今日完单数
     * @param id 用户ID
     * @return  完单数
     */
    @GetMapping("/getTodayFinishOrderNum/{id}")
    public Integer getTodayFinishOrderNum(@PathVariable("id") Integer id){
        System.out.println("我是10013");
        return port;
    }
}