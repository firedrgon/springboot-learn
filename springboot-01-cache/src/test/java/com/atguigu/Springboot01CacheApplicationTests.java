package com.atguigu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.atguigu.bean.Employee;
import com.atguigu.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot01CacheApplicationTests {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void contextLoads() {
//		stringRedisTemplate.opsForValue().append("hello", "world");
		Employee emp = employeeService.getEmp(1);
		redisTemplate.opsForValue().set("emp-1", emp);
	}

}
