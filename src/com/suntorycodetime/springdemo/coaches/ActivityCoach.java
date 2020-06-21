package com.suntorycodetime.springdemo.coaches;

import org.springframework.beans.factory.annotation.Value;

import com.suntorycodetime.springdemo.FortuneService;
import com.suntorycodetime.springdemo.Coach;

public class ActivityCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public ActivityCoach(FortuneService afc) {
		fortuneService = afc;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Activity Coach delay workout for activity 7.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
}
