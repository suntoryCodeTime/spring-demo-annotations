package com.suntorycodetime.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.suntorycodetime.springdemo.FortuneService;
import com.suntorycodetime.springdemo.coaches.ActivityCoach;
import com.suntorycodetime.springdemo.Coach;
import com.suntorycodetime.springdemo.services.ActivityFortuneService;

@Configuration
@PropertySource("classpath:activity.properties")
public class ActivityConfig {
		// define bean for our sad fortune service
		@Bean
		public FortuneService activityFortuneService() {
			return new ActivityFortuneService();
		}
		
		// define bean for our swim coach and inject dependency
		@Bean
		public Coach activityCoach() {
			return new ActivityCoach(activityFortuneService()); //Calling bean method up top that will give is a reference to a bean
		}

}
