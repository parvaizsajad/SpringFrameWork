package com.spring.javaconfig;

import org.springframework.stereotype.Component;

//@Component("student1")

public class Student {
	private Somasa somasa;
	
public Student(Somasa somasa) {
	
		this.somasa = somasa;
	}

public Somasa getSomasa() {
		return somasa;
	}

	public void setSomasa(Somasa somasa) {
		this.somasa = somasa;
	}

public void Study() {
	this.somasa.dispalay();
	System.out.println("Student is studying");
}
}
