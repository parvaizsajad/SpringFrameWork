package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import Spring.LifeCycle.Somosa;

@Configuration
//@ComponentScan(basePackages = "com.spring.javaconfig")
public class Config {
	@Bean
	public Somasa getSmossa() {
		return new Somasa();
	}
	@Bean(name ={"student","temp"} )
	public Student getStudent() {
		Student student = new Student( getSmossa() );
		return student;
	}
}
