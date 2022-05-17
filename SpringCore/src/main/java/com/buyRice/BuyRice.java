package com.buyRice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("buyRice")
public class BuyRice {
	
	@Value("${ricePrice}")
	private int ricePrice;
	
	@Autowired
	@Qualifier("seelu")
	private RiceLocation riceLocation;
	
	@Autowired
private PunchAdhaar punchAdhaar;
	
	

	@Required
	public void setRicePrice(int ricePrice) {
		this.ricePrice = ricePrice;
	}


	public void setRiceLocation(RiceLocation riceLocation) {
		this.riceLocation = riceLocation;
	}


	public void setPunchAdhaar(PunchAdhaar punchAdhaar) {
	this.punchAdhaar = punchAdhaar;
}


	public void buyRice() {
		punchAdhaar.punchAdhaar();
		System.out.println("Buying Rice...");
		System.out.println("The rice price is: "+ricePrice);
		riceLocation.riceLocation();
	}
}
