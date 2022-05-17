package com.jdbc.driver;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("jdbcBean.xml");
	Connection connection = applicationContext.getBean("connection",Connection.class);
	connection.printDetails();
	try {
		java.sql.Connection connection2 = connection.getConnection();
	System.out.println(connection2);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    
}
}
