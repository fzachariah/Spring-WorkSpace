package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		
		//Testing the scope of the bean
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext2.xml");
		Coach coach=applicationContext.getBean("myCoach",Coach.class);
		Coach thecoach=applicationContext.getBean("myCoach",Coach.class);
		
		
		System.out.println(thecoach.getDailyWorkout());
		if(coach==thecoach)
		{
			System.out.println("They are equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		applicationContext.close();
	}

}
