package com.buyRice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.buyRice")
@PropertySource("classpath:BuyRice.properties")
public class riceConfig {

	
//	@Bean
//	public PunchAdhaar punchAdhaar() {
//		return new PunchAdhaar();
//	}
//	
//	@Bean
//	public BuyRice buyRice() {
//		
//		BuyRice buyRice = new BuyRice();
//		buyRice.setPunchAdhaar(punchAdhaar());
//		return buyRice;
//	}
}
