package com.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Heart heart;
	@Autowired
	public Human(Heart heart) {
	this.heart=heart;
	
	System.out.println("constructor called");
	}

	public void setHeart(Heart heart) {
		this.heart=heart;
		System.out.println("setter injection");
	}
	
	public void isAlive() {
		if(heart!=null) {
		heart.pump();
		System.out.println("Congracts you are Alive");
		System.out.println(heart);
		
	}else {
		System.out.println("You are dead");
	}
	
}
}