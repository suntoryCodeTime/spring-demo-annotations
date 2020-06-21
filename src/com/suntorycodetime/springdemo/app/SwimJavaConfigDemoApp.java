package com.suntorycodetime.springdemo.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suntorycodetime.springdemo.coaches.SwimCoach;
import com.suntorycodetime.springdemo.config.SportConfig;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//Read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//Call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		//Close context
		context.close();
	}

}
