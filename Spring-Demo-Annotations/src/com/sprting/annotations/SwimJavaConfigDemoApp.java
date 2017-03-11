package com.sprting.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);
		
		//Coach coach=context.getBean("thatSillyCoach",Coach.class);
		//Coach coach=context.getBean("swimCoach",Coach.class);
		SwimCoach coach=context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getEmail());
		
		context.close();

	}

}
