package com.suntroycodetime.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;



@Component
public class FileFortuneService implements FortuneService {

	private List<String> data = new ArrayList();
	private Random r = new Random();
	
	public FileFortuneService() {
		File file = new File("fortune-data.txt");
		
		try {
			Scanner sc = new Scanner(file);
			
			// Add Fortune to Array
			while(sc.hasNext()) {
				data.add(sc.nextLine());
			}
			
		} catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		return data.get(r.nextInt(data.size()));
	}

}
