package com.atguigu.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class UserService {
	@Reference
	private TicketService ticketService;
	
	public void getTicket() {
		String ticket = ticketService.getTicket();
		System.out.println(ticket);
	}
}
