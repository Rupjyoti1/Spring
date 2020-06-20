package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the Spring Configuration File
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicaitonContext.xml");
		
		//retrieve bean from Spring container
		
		Coach  theCoach=context.getBean("myCoach",Coach.class);
		
		//call methods  on the bean
		
		System.out.println(theCoach.getDailyWorkOut());
		
		
		//calll our new method for FortuneService
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
