package com.didispace.web;

import com.didispace.Chapter1Application;
import com.didispace.domain.Teacher;
import com.didispace.domain.p.User;
import com.didispace.domain.p.UserRepository;
import com.didispace.domain.s.Message;
import com.didispace.domain.s.MessageRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Chapter1Application.class)
@WebAppConfiguration
public class Chapter1ApplicationRedis {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate<String, Teacher> redisTemplate;

	@Test
	public void test() throws Exception {
		// 保存字符串
		stringRedisTemplate.opsForValue().set("aaa", "111");
		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
	}

	@Test
	public void test2() throws Exception {
		// 保存对象
		Teacher teacher = new Teacher("超人", 20);
		redisTemplate.opsForValue().set(teacher.getUsername(), teacher);
		teacher = new Teacher("蝙蝠侠", 30);
		redisTemplate.opsForValue().set(teacher.getUsername(), teacher);
		teacher = new Teacher("蜘蛛侠", 40);
		redisTemplate.opsForValue().set(teacher.getUsername(), teacher);
		Assert.assertEquals(20, redisTemplate.opsForValue().get("超人").getAge().longValue());
		Assert.assertEquals(30, redisTemplate.opsForValue().get("蝙蝠侠").getAge().longValue());
		Assert.assertEquals(40, redisTemplate.opsForValue().get("蜘蛛侠").getAge().longValue());
	}
}


























