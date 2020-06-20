package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {

ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicaitonContext.xml");

  //retrieve bean from the container
  CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class);
  System.out.println(theCoach.getDailyWorkOut());
  System.out.println(theCoach.getDailyFortune());
  
	}

}
