package com.atguigu.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.atguigu.bean.Book;

@Service
public class BookService {
	@RabbitListener(queues = "atguigu")
	public void atguiguListener(Book book) {
		System.out.println(book);
	}
}
