package com.spring.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverProgramConstructor {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext	 applicationContext = new ClassPathXmlApplicationContext("com/spring/constructorInjection/config.xml");
Person person=(Person)applicationContext.getBean("Person");
System.out.println(person);
ConstructorOverloading co=(ConstructorOverloading) applicationContext.getBean("Add");
System.out.println(co);
System.out.println("value of a ="+co.a+"  the value of b is b "+ co.b);
	}

}
