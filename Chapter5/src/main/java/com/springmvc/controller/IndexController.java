package com.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yuanping on 2017/11/27.
 */
@RestController("/index")
public class IndexController {

    @RequestMapping("/get")
    public Map<String, String> get() {
        Map<String, String> map = new HashMap();
        map.put("name", "zhangsan");
        map.put("age", "25");
        return map;
    }
}
