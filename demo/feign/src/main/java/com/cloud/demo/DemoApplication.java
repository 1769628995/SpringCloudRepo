package com.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableDiscoveryClient将服务注册到注册中心
@EnableDiscoveryClient
//@EnableFeignClients注解开启Feign的功能：
@EnableFeignClients
//@EnableHystrixDashboard注解，开启hystrixDashboard
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
