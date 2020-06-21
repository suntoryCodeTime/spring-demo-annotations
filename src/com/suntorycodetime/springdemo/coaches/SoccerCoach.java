package com.suntorycodetime.springdemo.coaches;

import org.springframework.stereotype.Component;
import com.suntorycodetime.springdemo.Coach;

@Component
public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Patea la pelota!!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}