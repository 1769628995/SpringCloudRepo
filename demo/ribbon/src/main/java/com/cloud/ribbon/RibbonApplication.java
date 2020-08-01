package com.cloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//通过@EnableDiscoveryClient向服务中心注册
@EnableDiscoveryClient
//加@EnableHystrix注解开启Hystrix：
@EnableHystrix
//@EnableHystrixDashboard注解，开启hystrixDashboard：
//@EnableHystrixDashboard
public class RibbonApplication {

    public static void main(String[] args) {

        SpringApplication.run(RibbonApplication.class, args);
    }
//    向程序的ioc注入一个bean:restTemplate
    @Bean
//    @LoadBalanced注解表明这个restRemplate开启负载均衡的功能
    @LoadBalanced
    RestTemplate restTemplate() {

        return new RestTemplate();
    }
}
