package com.suntroycodetime.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Beware of the wold in sheeps's clothing",
			"Diligenc is the mother of good luck",
			"The journey is the reward"
	};
	
	private Random rand = new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return data[rand.nextInt(data.length)];
	}

}
