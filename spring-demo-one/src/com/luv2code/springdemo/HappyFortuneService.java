package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	
	
	@Override
	public String getFortune() {
		System.out.println("I am in  getFortune of HappyFortuneService");
		return "Today is Your Lucky day";
	}

}
