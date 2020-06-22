/*
 * Note, Spring Injection Type Superiority is Debatable and it is MORE IMPORTANT to be CONSISTENT
 * with your coding style.
 * */

package com.suntorycodetime.springdemo.coaches;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.suntorycodetime.springdemo.Coach;
import com.suntorycodetime.springdemo.FortuneService;

@Component
//@Scope("prototype")		//Prototype scope means that a new instance is created everytime
public class TennisCoach implements Coach {
	
	/* When Autowired used above the variable it is using reflection for Field Injection */
	//@Autowired
	//@Qualifier("happyFortuneService")
	//@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/* Constructor Injection*/
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	/*Constructor Injection with @Qualifier annotation*/
	@Autowired
	public TennisCoach(@Qualifier("fileFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
//	public TennisCoach() {
//		super();
//		System.out.println(">> In TennisCoach Default Constructor");
//	}
	
	@PostConstruct	
	public void doStartUp() {
		System.out.println(">> Tennis Coach: Inside Startup Method");
	}
	
	@PreDestroy
	public void doCleanUp() {
		System.out.println(">> Tennis Coach: Inside Cleanup Method");
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
