package com.spring.orm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
        System.out.println( "Hello World!" );
        
 ApplicationContext co = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
 StudentDao stu = co.getBean("studentDao",StudentDao.class);
	/*
	 * Student student = new Student(111,"Parvaiz_Sajad_Mir","Bohripora_Sopore");
	 * int insert = stu.insert(student);
	 * System.out.println("the key has been inserted "+ insert);
	 */
 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 while(true) {
	 System.out.println("press 1 to add new student");
	 System.out.println("press 2 to get all students");
	 System.out.println("press 3 to get a student");
	 System.out.println("press 4 to delete a student");
	 System.out.println("press 5 to update student details");
	 System.out.println("press 6 to exit");
	 System.out.println("Enter the option");
	 int input=Integer.parseInt(br.readLine());
	 switch (input) {
	case 1:
		System.out.println("enter student id \n");
		int id =Integer.parseInt(br.readLine());
		System.out.println("enter user name\n");
		String name=br.readLine();
		System.out.println("enter user city\n");
		String city=br.readLine();
		Student student= new Student();
		student.setStudentId(id);
		student.setStudentName(name);
		student.setStudentCity(city);
		int r = stu.insert(student);
		System.out.println(r+" key added");
		break;
case 2:
		List<Student> allStudents = stu.getAllStudents();
		for(Student s:allStudents) {
			System.out.println("the id is "+s.getStudentId());
			System.out.println("the name is "+s.getStudentName());
			System.out.println("the name of city is "+s.getStudentCity());
			System.out.println("______________________________________________");
		}
		break;
case 3:
	System.out.println("Enter the student id");
	int stId=Integer.parseInt(br.readLine());
	Student student2 = stu.getStudent(stId);
	System.out.println(student2);
	
	
	break;
case 4:
	System.out.println("Eneter id to be deleted ");
	int delId=Integer.parseInt(br.readLine());
	stu.deleteStudent(delId);
	System.out.println("the student has been deleted");
	break;
case 5:
	System.out.println("enter student id \n");
	int uid =Integer.parseInt(br.readLine());
	System.out.println("enter user name\n");
	String uname=br.readLine();
	System.out.println("enter user city\n");
	String ucity=br.readLine();
	Student ustudent= new Student();
	ustudent.setStudentId(uid);
	ustudent.setStudentName(uname);
	ustudent.setStudentCity(ucity);
	stu.updateStudent(ustudent);
	System.out.println("the student has been updated");
	break;
case 6:
	System.out.println("thanks for using this application");
	System.exit(1);
	break;
	
	default:
		System.out.println("Invalid option try entering the valid option");
		break;
	}
 }
 
    }
}
