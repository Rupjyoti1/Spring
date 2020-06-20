package com.luv2code.springdemo;

public class BaseBallCoach implements Coach{

	//define a private field for depedency injection
		private FortuneService fortuneService;
		
		
		//define a constructor for dependency injection
		
		public BaseBallCoach(FortuneService theFortuneSerive) {
			fortuneService= theFortuneSerive;
			
		}
		
	
@Override
public String getDailyWorkOut() {
	return "Spend 30 minutes on batting practice";
    }

@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return fortuneService.getFortune();
}
 }
