package com.atguigu.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {
	@Scheduled(cron = "2,5,7 * * * * 0-7")
	public void hello() {
		System.out.println("hello scheduled...");
	}
}



