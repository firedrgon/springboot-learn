package com.didispace.controller;

import com.didispace.domain.User;
import com.didispace.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Yuanping on 2017/11/26.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    @RequestMapping("/findById")
    @ResponseBody
    public User findById(Integer id) {
        User user = userService.getXUserById(id);
        return user;
    }

    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserById(Integer id){
        User user = userService.getUserById(id);
        logger.info(user.toString());
        return user;
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(){
        User user =new User();
        user.setName("李四");
        user.setAge(22);
        return  userService.add(user);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(){
        User user =new User();
        user.setId(1);
        user.setAge(88);
        user.setName("张三丰");
        return  userService.update(user);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(Integer id){
        return  userService.delete(id);
    }

}
