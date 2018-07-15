package com.atguigu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Binding.DestinationType;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.atguigu.bean.Book;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02AmqpApplicationTests {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	@Autowired
	private AmqpAdmin amqpAdmin;
	
	@Test
	public void contextLoads() {
		Book book = new Book("沈远平","Java从入门到放弃");
		rabbitTemplate.convertAndSend("exchange.direct", "atguigu", book);
		
	}
	
	@Test
	public void receive() {
		Book book = (Book)rabbitTemplate.receiveAndConvert("atguigu");
		System.out.println(book.getBookName());
	}
	
	@Test
	public void amqpAdminTest() {
		amqpAdmin.declareExchange(new DirectExchange("amqp.direct"));
		
		amqpAdmin.declareQueue(new Queue("amqp.queue"));
		
		amqpAdmin.declareBinding(new Binding("amqp.queue", DestinationType.QUEUE, "amqp.direct", "amqp.direct", null));
	}
}



