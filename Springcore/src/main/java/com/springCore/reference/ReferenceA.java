package com.springCore.reference;

public class ReferenceA{
	int x;
	B ob;
	@Override
	public String toString() {
		return "ReferenceA [x=" + x + ", ob=" + ob + "]";
	}
	public ReferenceA(int x, B ob) {
		super();
		this.x = x;
		this.ob = ob;
	}
	public ReferenceA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}

}
