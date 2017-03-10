package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		
		//Testing the scope of the bean
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach coach=applicationContext.getBean("myCoach",Coach.class);
		Coach thecoach=applicationContext.getBean("myCoach",Coach.class);
		
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
