package com.core.Student;

public class MainClass {
public static void main(String[] args) {
	Student st=new Student();
	Marks marks=new Marks();
	
	marks.setSub1(9);
	marks.setSub2(5);

	
	st.setRollNo(1);
	st.setName("parvaiz");
	st.setMarks(marks);
	System.out.println(st);
}
}
