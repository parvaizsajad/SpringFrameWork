package com.core.SpringCore;

public class HelloWorld {

	private String message;
	
	
	
public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}



public HelloWorld(String message) {
		super();
		this.message = message;
		System.out.println("peremiterized constructor");
	}



//	public String getMessage() {
//		return message;
//		
//	}
//
//	public void setMessage(String message) {
//		this.message = message;
//	}

	public void printhello() {
		System.out.println("Hello world"+ message);
	}
}
