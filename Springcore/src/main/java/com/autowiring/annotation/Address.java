package com.autowiring.annotation;

public class Address {
public Address(String address1, String address2) {
		super();
		Address1 = address1;
		Address2 = address2;
	}
private String Address1;
private String Address2;
@Override
public String toString() {
	return "Address [Address1=" + Address1 + ", Address2=" + Address2 + "]";
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public String getAddress1() {
	return Address1;
}
public void setAddress1(String address1) {
	System.out.println("setting value 1");
	Address1 = address1;
}
public String getAddress2() {
	return Address2;
}
public void setAddress2(String address2) {
	Address2 = address2;
	System.out.println("setting value 2");
}
}
