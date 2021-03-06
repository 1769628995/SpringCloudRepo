package com.cloud.ribbon.controller;

import com.cloud.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PiController {
    @Autowired
    RibbonService ribbonService;
    @RequestMapping(value="/pi")
    public String Pi(@RequestParam String name)
    {
        System.out.println("ribbon");
        return ribbonService.PiService(name);
    }

}
