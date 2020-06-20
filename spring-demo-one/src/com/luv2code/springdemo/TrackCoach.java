	package com.luv2code.springdemo;
	
	public class TrackCoach implements Coach {
	
		private FortuneService fortuneService;
		
		public TrackCoach() {
			System.out.println("I am in No-arg Constructor");
		}
		
		public TrackCoach(FortuneService fortuneService) {
			this.fortuneService=fortuneService;
		}
		
		@Override
		public String getDailyWorkOut() {
			return "Run a Hard 5k";
		}
	
		@Override
		public String getDailyFortune() {
			System.out.println("Inside TrackCoach Class");
			return fortuneService.getFortune();
		}
	
		//add an init method
		
		public void doMyStartupStaff() {
			System.out.println("Inside TrackCoach:doMyStartupStaff method ");
		}
		
		//add a destroy method
		
		public void doMyCleanUpStaff() {
			System.out.println("Inside TrackCoach:doMyCleanUpStaff method ");
		}
	}
