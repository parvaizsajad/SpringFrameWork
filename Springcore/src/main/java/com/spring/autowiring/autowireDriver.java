package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowireDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext co = new ClassPathXmlApplicationContext("com/spring/autowiring/autowiringConfig.xml");
Emp emp=co.getBean("Emp1",Emp.class);
System.out.println(emp);
	}

}
