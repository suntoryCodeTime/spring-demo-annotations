package com.suntorycodetime.springdemo.coaches;

import org.springframework.beans.factory.annotation.Value;

import com.suntorycodetime.springdemo.FortuneService;
import com.suntorycodetime.springdemo.Coach;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;	
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
