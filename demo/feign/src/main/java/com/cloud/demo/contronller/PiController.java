package com.cloud.demo.contronller;

import com.cloud.demo.inter.SchedualServicePi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PiController {
//    引用feign对应服务调用接口
@Resource
    SchedualServicePi schedualServicePi;
    @RequestMapping(value="pi",method = RequestMethod.GET)
    public String sayPi(@RequestParam String name)
    {
        System.out.println("feign");
        return  schedualServicePi.sayPiFromClientOne(name);
    }


}
