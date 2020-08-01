package com.cloud.demo.fallback;

import com.cloud.demo.inter.SchedualServicePi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServicePi {
    @Override
    public String sayPiFromClientOne(String name) {
        return "feign sorry"+name;
    }
}
