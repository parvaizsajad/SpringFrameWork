package com.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverCollege {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(collegeConfig.class);
		CollegeFee collegeFee=null;
		try {
			 collegeFee = context.getBean("collegeFee",CollegeFee.class);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("bean not available "+e.getLocalizedMessage());
		}
		
		if(collegeFee!=null) {
		collegeFee.submitFee();
		System.out.println("you are allowed in college");
		}
		else {
			System.out.println("You are not allowed");
		}
		
		
	}
}
