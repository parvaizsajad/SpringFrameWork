package com.buyRice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverRice {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(riceConfig.class);
		BuyRice rice = context.getBean("buyRice",BuyRice.class);
		rice.buyRice();
		context.close();
		
		
	}
}
