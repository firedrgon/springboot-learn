package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.service.TicketService;
@RestController
public class TicketController {
	@Autowired
	private TicketService ticketService;
	
	@GetMapping("/getTicket")
	public String getTicket() {
		return ticketService.getTicket();
	}
}
