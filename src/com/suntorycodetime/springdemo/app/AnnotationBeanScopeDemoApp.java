package com.suntorycodetime.springdemo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suntroycodetime.springdemo.Coach;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach otherCoach = context.getBean("tennisCoach", Coach.class);
		
		//Check to see if they are same
		boolean res = (theCoach == otherCoach);
		System.out.println("\nPoint to the same object: " + res);
		System.out.println("\nMem local for theCoach: " + theCoach);
		System.out.println("\nMem local for otherCoach: " + otherCoach);
		
		//Call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(otherCoach.getDailyWorkout());
		
		//Close context
		context.close();
	}

}
