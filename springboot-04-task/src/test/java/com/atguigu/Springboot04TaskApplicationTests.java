package com.atguigu;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot04TaskApplicationTests {
	@Autowired
	private JavaMailSenderImpl mailSender;

	@Test
	public void contextLoads() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setSubject("主题");
		message.setText("hello message");
		
		message.setTo("77373@qq.com");
		message.setFrom("8822@qq.com");
		mailSender.send(message);
	}
	
	@Test
	public void test() throws MessagingException {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
		helper.setSubject("主题");
		helper.setText("hello message");
		
		helper.setTo("77373@qq.com");
		helper.setFrom("8822@qq.com");
		
		helper.addAttachment("01.jpg", new File("f:/01.jpg"));
		
		mailSender.send(mimeMessage);
	}
}














