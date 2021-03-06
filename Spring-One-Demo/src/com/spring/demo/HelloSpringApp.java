package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring configuration file
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationCOntext.xml");
		
		//retrieve the bean
		
		Coach coach=applicationContext.getBean("myCoach",Coach.class);
		
		//call methods on the bean	
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		//close the context
		applicationContext.close();

	}

}
