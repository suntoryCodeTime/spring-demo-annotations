/*
 * Note, Spring Injection Type Superiority is Debatable and it is MORE IMPORTANT to be CONSISTENT
 * with your coding style.
 * */

package com.suntroycodetime.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	/* When Autowired used above the variable it is using reflection for Field Injection */
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/* Constructor Injection*/
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	public TennisCoach() {
		super();
		System.out.println(">> In TennisCoach Default Constructor");
	}
	
	/* Setter Injection*/
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice you backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
