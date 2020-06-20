package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicaitonContext.xml	");
		
		Coach theCoach =context.getBean("myCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkOut());
		
				context.close();
	}

}