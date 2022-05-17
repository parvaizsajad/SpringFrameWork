package com.core.Student;

public class Student {
 private int rollNo;
 private String name;
 private Marks marks;
 
 public void totalmarks() {
System.out.println(marks.getSub1()+marks.getSub2());	 
 }
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Marks getMarks() {
	return marks;
}
public void setMarks(Marks marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks +" totalMarks= "+(marks.getSub1()+marks.getSub2())+ "]";
}
 

}
