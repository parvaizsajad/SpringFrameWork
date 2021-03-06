package com.springMvc.search;

import java.util.Date;

public class Form {
	private String name;
	private long id;
	private Date dob;
	private String courses;
	private String gender;
	private String type;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Form() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Form [name=" + name + ", id=" + id + ", dob=" + dob + ", courses=" + courses + ", gender=" + gender
				+ ", type=" + type + ", address=" + address + "]";
	}

	
	public Form(String name, long id, Date dob, String courses, String gender, String type) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.courses = courses;
		this.gender = gender;
		this.type = type;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
