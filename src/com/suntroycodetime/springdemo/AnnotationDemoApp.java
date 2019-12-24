package com.suntroycodetime.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get the bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		//Call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Close context
		context.close();
	}

}
