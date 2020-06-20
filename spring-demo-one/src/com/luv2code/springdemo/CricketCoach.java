package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Inside No-Arg Constructor:CricketCoach");
	}
	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkOut() {
		System.out.println("Inside Cricket:getDailyWorkOut");
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
