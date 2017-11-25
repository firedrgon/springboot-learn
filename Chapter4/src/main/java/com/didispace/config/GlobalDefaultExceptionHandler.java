package com.didispace.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 1.新建一个Class，这里取名为GlobalDefaultExceptionHandler
 * 2.在class上添加注解，@ControllerAdvice
 * 3.在class中添加一个方法
 * 4.在方法商添加@ExceptionHandler拦截相应的异常信息
 * 5.如果返回的是View,方法的返回值是ModelAndView
 * 6.如果返回的是String或者Json数据，那么需要在方法商添加@ResponseBody注解
 * Created by Yuanping on 2017/11/25.
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String defaultExceptionHandler(HttpServletRequest request, Exception e) {

//        ModelAndView view = new ModelAndView();
        return "对不起,服务器繁忙，请稍后再试!";
    }
}
