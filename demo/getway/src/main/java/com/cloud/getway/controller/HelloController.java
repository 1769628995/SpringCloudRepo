package com.cloud.getway.controller;


import com.cloud.getway.util.HttpUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping(value = "/Getfriend")
    public String get()
    {
        return"get你好";
    }

    @PostMapping(value = "/Postfriend")
    public String post()
    {

        return"post你好";
    }

    @GetMapping(value = "/sendGet")
    public String sendGet()
    {
        System.out.println("123");
        return  HttpUtils.sendGet("http://localhost:8768/hello/Getfriend",null);

    }

}
