package com.atguigu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.atguigu.bean.Person;
import com.fasterxml.jackson.core.io.IOContext;

import net.minidev.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {
	@Autowired
	private Person person;
	
	@Autowired
	private ApplicationContext ico;
	
	@Test
	public void testHelloService() {
		boolean helloService = ico.containsBean("helloService");
		System.out.println(helloService);
	}
	
	@Test
	public void personTest() {
		System.out.println(person.toString());
	}

}
