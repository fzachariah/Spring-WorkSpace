package com.febin.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try{
			System.out.println("Creating 3 object");	
			Student student=new Student("Febin", "Zachariah", "febinzachariah6@gmail.com");
			Student student1=new Student("Sanjay", "Tiwari", "stiwari@gmail.com");
			Student student2=new Student("Rohit", "Shetty", "rshettyy@gmail.com");
			
			session.beginTransaction();
			session.save(student);
			session.save(student1);
			session.save(student2);
			
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			factory.close();
		}

	}

}
