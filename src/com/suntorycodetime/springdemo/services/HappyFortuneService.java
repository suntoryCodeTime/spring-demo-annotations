package com.suntorycodetime.springdemo.services;

import org.springframework.stereotype.Component;

import com.suntorycodetime.springdemo.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day!";
	}

}
