package com.suntorycodetime.springdemo.services;

import org.springframework.stereotype.Component;

import com.suntorycodetime.springdemo.FortuneService;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is a sad day.";
	}

}
