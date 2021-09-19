package com.springCore;

public class student {

	public int StudentId;
	public String StudentName;
	public String StudentAddress;
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
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	public student(int studentId, String studentName, String studentAddress) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentAddress = studentAddress;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}
	
	
}
