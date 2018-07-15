package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.service.HelloService;

@RestController
public class AysncController {
	@Autowired
	private HelloService helloService;
	
	@GetMapping("/hello")
	public String hello() {
		helloService.hello();
		return "success";
	}
}














