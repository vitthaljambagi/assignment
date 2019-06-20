package com.xworkz.app.util;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Component;

@Component
public class RandomPasswordGenerator {

	public RandomPasswordGenerator() {
		System.out.println(this.getClass().getCanonicalName()+" is Created...........");
	}
	String capLetters="QWERTYUIOPLKJHGFDSAZXCVBNM";
	String lowLetters="qwertyuioplkjhgfdsazxcvbnm";
	String specLetters="*^%$#/-+";
	String numLetters="1234567890";
	
	public String generatePasseword() {
		
		StringBuilder builder=new StringBuilder();
		builder.append(RandomStringUtils.random(2,capLetters)).append(RandomStringUtils.random(2, specLetters)).append(RandomStringUtils.random(2,lowLetters)).append(RandomStringUtils.random(2,numLetters));
		return new String(builder);
			
	}
	public int generateRandomPin() {
		
		String randomNumber=RandomStringUtils.random(4,numLetters);
		int pin=(int) Long.parseLong(randomNumber);
		
		return pin;
	}
}
