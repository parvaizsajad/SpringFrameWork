package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ApplicationContext ac= new ClassPathXmlApplicationContext("com/spring/javaconfig/Config.xml");
ApplicationContext ac=	new AnnotationConfigApplicationContext(Config.class);
Student st =ac.getBean("temp",Student.class);
System.out.println(st);
st.Study();
	}

}
