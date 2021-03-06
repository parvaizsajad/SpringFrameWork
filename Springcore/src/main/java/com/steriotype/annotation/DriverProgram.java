package com.steriotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext co = new ClassPathXmlApplicationContext("com/steriotype/annotation/config.xml");
	Student student=co.getBean("student",Student.class);
	System.out.println(student);
	System.out.println(student.hashCode());
	System.out.println(student.getPlaces());
	System.out.println(student.getPlaces().getClass().getName());
	Student stu2 =co.getBean("student",Student.class);
	System.out.println(stu2.hashCode());
	
	Teacher tech=co.getBean("teacher",Teacher.class);
	Teacher tech2=co.getBean("teacher",Teacher.class);
	System.out.println(tech.hashCode());
	System.out.println(tech2.hashCode());
	}

}
