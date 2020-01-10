package com.suntorycodetime.springdemo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suntroycodetime.springdemo.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
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
