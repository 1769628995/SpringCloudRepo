package com.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "hiError")
public String PiService(String name)
{
//    根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名
//    restTemplate.getForObject可实现负载均衡

    return restTemplate.getForObject("http://SERVICE-PI/pi?name="+name,String.class);

}
    public String hiError(String name) {
        return "pi,"+name+",ribbon,error!";
    }
}
