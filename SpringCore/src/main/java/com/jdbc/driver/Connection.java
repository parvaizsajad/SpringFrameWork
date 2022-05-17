package com.jdbc.driver;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class Connection {

	@Value("${mysql.username}")
	private String username;
	@Value("${mysql.password}")
	private String password;
	@Value("${mysql.url}")
	private String url;
	@Value("${mysql.driver}")
	private String driver;
	
	public void printDetails() {
		System.out.println("username "+username+ " password "+ password+ " url "+url+ " driver "+driver);
	}
	
	public java.sql.Connection getConnection() throws SQLException {
		java.sql.Connection conn=null;
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 conn = DriverManager.getConnection(url,username,password);
		System.out.println("connection succefull");
		return conn;
		
	}
}
