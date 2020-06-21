package com.suntorycodetime.springdemo.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suntorycodetime.springdemo.config.SportConfig;
import com.suntorycodetime.springdemo.Coach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//Read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach otherCoach = context.getBean("soccerCoach", Coach.class);
		
		//Call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(otherCoach.getDailyWorkout());
		
		//Close context
		context.close();
	}

}
