package com.spring.autowire;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Heart {
private String heartname;
private int heartNo;

	public void pump() {
		System.out.println("The heart is pumping");
	}
	
	public String getHeartname() {
		return heartname;
	}
	@Value("${heartname}")
	public void setHeartname(String heartname) {
		this.heartname = heartname;
	}
	public int getHeartNo() {
		return heartNo;
	}
	@SuppressWarnings("deprecation")
	@Value("${heartNo}")
	
	public void setHeartNo(int heartNo) {
		this.heartNo = heartNo;
	}
	@Override
	public String toString() {
		return "Heart [heartname=" + heartname + ", heartNo=" + heartNo + "]";
	}
	
	
	
}
