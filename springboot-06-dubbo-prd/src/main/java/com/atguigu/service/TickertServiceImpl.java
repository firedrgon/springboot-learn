package com.atguigu.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service
public class TickertServiceImpl implements TicketService {

	@Override
	public String getTicket() {
		return "hello dubbo";
	}

}
