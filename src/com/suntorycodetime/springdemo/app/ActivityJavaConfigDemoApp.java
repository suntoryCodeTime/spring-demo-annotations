package com.suntorycodetime.springdemo.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.suntorycodetime.springdemo.coaches.ActivityCoach;
import com.suntorycodetime.springdemo.config.ActivityConfig;

public class ActivityJavaConfigDemoApp {

	public static void main(String[] args) {
		//Read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ActivityConfig.class);
		
		//Get the bean from spring container
		ActivityCoach theCoach = context.getBean("activityCoach", ActivityCoach.class);
		
		//Call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		//Close context
		context.close();
	}

}
