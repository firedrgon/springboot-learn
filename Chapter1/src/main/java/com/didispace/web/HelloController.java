package com.didispace.web;

import com.didispace.exception.MyException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yuanping on 2017/9/17.
 */
@RestController
public class HelloController {
    @Value("${com.didispace.blog.name}")
    private String name;
    @Value("${com.didispace.blog.title}")
    private String title;

    @RequestMapping("/hello")
    public String index() {
        System.out.println(name);
        System.out.println(title);
        return "Hello World 梁晓娟";
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }
}
