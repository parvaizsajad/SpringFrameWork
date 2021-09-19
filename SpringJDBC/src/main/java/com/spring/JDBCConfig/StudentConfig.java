package com.spring.JDBCConfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbcDao.StudentDao;
import com.spring.jdbcDao.StudentDaoImpl;
@Configuration
@ComponentScan(basePackages= { "com.spring.jdbcDao"})
public class StudentConfig {
	@Bean(name = {"ds"})
	public DataSource getDataSource() {
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	@Bean(name = {"jdbcTemplate"})
public JdbcTemplate getTemplate() {
	JdbcTemplate jdbcTemplate= new JdbcTemplate();
	jdbcTemplate.setDataSource(getDataSource());
	return jdbcTemplate;
}
	@Bean(name = {"StudentDao"})
	public StudentDao getStudentDao() {
		StudentDaoImpl daoImpl=new StudentDaoImpl();
		daoImpl.setJdbcTemplate(getTemplate());
		return daoImpl;
	}
}
