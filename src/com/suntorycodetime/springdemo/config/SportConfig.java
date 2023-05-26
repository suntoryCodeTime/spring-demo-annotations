package com.suntorycodetime.springdemo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.suntorycodetime.springdemo.FortuneService;
import com.suntorycodetime.springdemo.coaches.SwimCoach;
import com.suntorycodetime.springdemo.Coach;
import com.suntorycodetime.springdemo.services.SadFortuneService;

@Configuration
@ComponentScan("com.suntorycodetime.springdemo.coaches, com.suntorycodetime.springdemo.services")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService()); //Calling bean method up top that will give is a reference to a bean
	}
}
