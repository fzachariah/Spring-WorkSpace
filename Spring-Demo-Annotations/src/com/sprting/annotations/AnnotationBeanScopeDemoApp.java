package com.sprting.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach=applicationContext.getBean("tennisCoach",Coach.class);
		Coach alphaCoach=applicationContext.getBean("tennisCoach",Coach.class);
		
		boolean result=(coach==alphaCoach);
		System.out.println(result);
		

	}

}
