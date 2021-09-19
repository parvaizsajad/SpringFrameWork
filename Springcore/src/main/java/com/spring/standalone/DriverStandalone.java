package com.spring.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverStandalone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext co = new ClassPathXmlApplicationContext("com/spring/standalone/AloneConfig.xml");
Person per=co.getBean("person1",Person.class);
System.out.println(per);
System.out.println(per.getFriends().getClass().getName());
System.out.println(per.getFeeStructure());
System.out.println(per.getFeeStructure().getClass().getName());
System.out.println(per.getProperties());
System.out.println(per.getProperties().getClass().getName());
	}

}
