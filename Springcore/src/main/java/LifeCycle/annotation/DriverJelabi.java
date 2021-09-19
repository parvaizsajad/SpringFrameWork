package LifeCycle.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import LifeCycle.Interface.Pepsi;

public class DriverJelabi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext cop = new ClassPathXmlApplicationContext("LifeCycle/annotation/jelabiConfig.xml");
		 jelabi so=(jelabi)cop.getBean("jel");
		 System.out.println(so);
		 cop.registerShutdownHook();
	}

}
