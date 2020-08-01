package com.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//通过@EnableEurekaClient向服务中心注册
@EnableEurekaClient
public class ClientProvideApplication {

    public static void main(String[] args) {

        SpringApplication.run(ClientProvideApplication.class, args);
    }

}
