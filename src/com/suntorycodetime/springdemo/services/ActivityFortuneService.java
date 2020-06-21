package com.suntorycodetime.springdemo.services;

import org.springframework.stereotype.Component;

import com.suntorycodetime.springdemo.FortuneService;

@Component
public class ActivityFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is the activity 7 fortune service.";
	}

}
