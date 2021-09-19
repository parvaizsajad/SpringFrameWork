package com.spring.autowiring;

public class Emp {
	Address add;

	public Emp(Address add) {
		super();
		this.add = add;
		System.out.println("inside the emp constructor");
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		System.out.println("setting value 3 emp");
		this.add = add;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [add=" + add + "]";
	}
	

}
