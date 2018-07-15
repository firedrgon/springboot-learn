package com.atguigu.config;

import java.net.UnknownHostException;
import java.util.LinkedHashSet;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheManager.RedisCacheManagerBuilder;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import com.atguigu.bean.Employee;

@Configuration
public class MyRedisConfig {
	@Bean
	public RedisTemplate<Object, Employee> empRedisTemplate(
			RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
		RedisTemplate<Object, Employee> template = new RedisTemplate<>();
		template.setConnectionFactory(redisConnectionFactory);
		
		Jackson2JsonRedisSerializer<Employee> serial = new Jackson2JsonRedisSerializer<Employee>(Employee.class);
		template.setDefaultSerializer(serial);
		return template;
	}
	
	@Bean
	public RedisCacheManager cacheManager(RedisConnectionFactory redisConnectionFactory,
			ResourceLoader resourceLoader) {
		RedisCacheManager cacheManager = RedisCacheManager.create(redisConnectionFactory);

		return cacheManager;
	}
}











