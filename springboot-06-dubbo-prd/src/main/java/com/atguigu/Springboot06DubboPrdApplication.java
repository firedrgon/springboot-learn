package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@SpringBootApplication
public class Springboot06DubboPrdApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot06DubboPrdApplication.class, args);
	}
}
