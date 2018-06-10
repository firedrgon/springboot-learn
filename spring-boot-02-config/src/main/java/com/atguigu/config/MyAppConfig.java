package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atguigu.service.HelloService;

@Configuration
public class MyAppConfig {

	@Bean
	public HelloService helloService() {
		return new HelloService();
	}
}
