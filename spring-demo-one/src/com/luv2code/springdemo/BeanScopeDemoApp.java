package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicaitonContext.xml	");
		
		Coach theCoach =context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		boolean result=(theCoach==alphaCoach);
		System.out.println(result);
		System.out.println("theCoach "+theCoach);
		System.out.println("alphaCoach "+alphaCoach);
		
		context.close();
	}

}
