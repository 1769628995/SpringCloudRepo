package com.cloud.demo.contronller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {

        Map<String,Object> map=new HashMap<String,Object>();
        map.put("a",123);
        map.put("b",456);
        map.put("c",789);
        List<Map<String,Object>> data = (List<Map<String,Object>>) map;
        System.out.println(data);
    }
}
