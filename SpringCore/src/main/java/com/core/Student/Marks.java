package com.core.Student;

public class Marks {

	private int sub1;
	private int sub2;

	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	
	
	@Override
	public String toString() {
		return "Marks [sub1=" + sub1 + ", sub2=" + sub2  + "]";
	}
	
}
