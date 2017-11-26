package com.ypvoid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yuanping on 2017/11/26.
 */
@RestController
public class Hello3Controller {

    @RequestMapping("hello3")
    public String hello3() {
        return "hello3";
    }
}
