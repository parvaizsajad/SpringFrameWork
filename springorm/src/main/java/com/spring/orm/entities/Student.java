package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentCity=" + StudentCity
				+ "]";
	}
	@Id
	@Column(name = "student_id")
 private int StudentId;
	@Column(name = "student_name")
 private String StudentName;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentCity() {
		return StudentCity;
	}
	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentCity) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentCity = studentCity;
	}
	@Column(name = "student_city")
 private String StudentCity;
}
