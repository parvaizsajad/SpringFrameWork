package com.spring.JDBC;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.JDBCConfig.StudentConfig;
import com.spring.jdbcDao.StudentDao;
import com.spring.jdbcDao.StudentDaoImpl;
import com.spring.jdbcEntities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		//this is for the xml configuration
		//ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/JDBC/config.xml");
		
		//configuration using annotation java class
		
		ApplicationContext ac =new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentDao st = ac.getBean("StudentDao", StudentDao.class);

		// selecting all students from the database.

		List<Student> allStudents = st.getAllStudents();
		for (Student s : allStudents) {
			System.out.println(s);
		}

		/*
		 * // code to select the data from the database. Student student =
		 * st.getStudent(2); System.out.println(student);
		 */

		/*
		 * //code to delete the records. Scanner sc=new Scanner(System.in);
		 * System.out.println("enter the id to be deleted"); int id=sc.nextInt(); int
		 * del = st.delete(id); System.out.println("deleted record  "+del);
		 */

		/*
		 * // code for update
		 * 
		 * Student stu=new Student(); stu.setId(4); stu.setName("MarilynSultana");
		 * stu.setCity("Assam"); int res = st.update(stu);
		 * System.out.println("the rows updated are "+res);
		 */

		
		  //insert to the database
		  
			/*
			 * Student stud=new Student(); stud.setId(6); stud.setName("Mir");
			 * stud.setCity("BtmLayout"); int result = st.insert(stud);
			 * System.out.println("the number of affected results are "+result);
			 */

		/*
		 * JdbcTemplate jdbcTemplate = ac.getBean("JdbcTemplate",JdbcTemplate.class);
		 * 
		 * // inser querry String
		 * qurrey="insert into student (id,name,city) values(?,?,?)"; // fire querry int
		 * result = jdbcTemplate.update(qurrey,4,"Marlyin","kashmiri");
		 * System.out.println("the number of records inserted  "+result);
		 */

	}
}
