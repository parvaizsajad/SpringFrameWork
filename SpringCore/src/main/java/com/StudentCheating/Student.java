package com.StudentCheating;

public class Student {

	private Cheating cheating;


	public void setCheating(Cheating cheating) {
		this.cheating = cheating;
	}
	
	public void studentCheating() {
		cheating.mathCheating();
	}
	
}
