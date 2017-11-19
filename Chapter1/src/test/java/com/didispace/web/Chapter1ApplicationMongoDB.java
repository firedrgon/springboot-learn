package com.didispace.web;

import com.didispace.Chapter1Application;
import com.didispace.domain.User2;
import com.didispace.service.UserMongoDBRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Chapter1Application.class)
@WebAppConfiguration
public class Chapter1ApplicationMongoDB {
	@Autowired
	private UserMongoDBRepository userRepository;

	@Before
	public void setUp() {
		userRepository.deleteAll();
	}
	@Test
	public void test() throws Exception {
		// 创建三个User，并验证User总数
		userRepository.save(new User2(1L, "didi", 30));
		userRepository.save(new User2(2L, "mama", 40));
		userRepository.save(new User2(3L, "kaka", 50));
		Assert.assertEquals(3, userRepository.findAll().size());
		// 删除一个User，再验证User总数
		User2 u = userRepository.findOne(1L);
		userRepository.delete(u);
		Assert.assertEquals(2, userRepository.findAll().size());
		// 删除一个User，再验证User总数
		u = userRepository.findByUsername("mama");
		userRepository.delete(u);
		Assert.assertEquals(1, userRepository.findAll().size());
	}
}


























