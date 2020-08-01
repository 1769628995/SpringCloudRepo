package com.cloud.demo.inter;

import com.cloud.demo.fallback.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//feign已经整合了ribbon 所以@FeignClient注解只需要将服务名作为参数即可实现负载均衡
@FeignClient(value="service-pi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServicePi {
    @RequestMapping(value="pi",method = RequestMethod.GET)
    String sayPiFromClientOne(@RequestParam(value="name") String name);

}
