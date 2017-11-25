package com.didispace.controller;

import com.didispace.domain.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Yuanping on 2017/11/20.
 */
@RestController
public class DemoController {
    @RequestMapping("test")
    public String test() {
        return "000099";
    }

    @RequestMapping("test2")
    public String test2() {
        return "00009922";
    }

    @RequestMapping("test3")
    public String test3() {
        return "000099223333";
    }

    @RequestMapping("getDemo")
    public Demo getDemo() {
        Demo demo = new Demo();
        demo.setId(11L);
        demo.setName("zhangsan");
        demo.setCreateTime(new Date());
        return demo;
    }
}

