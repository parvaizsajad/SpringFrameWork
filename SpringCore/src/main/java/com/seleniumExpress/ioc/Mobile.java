package com.seleniumExpress.ioc;

public class Mobile {

	public static void main(String[] args) {

//		Airtel airtel=new Airtel();
//		airtel.calling();
//		airtel.data();

//		Vodaphone vodaphone=new Vodaphone();
//		vodaphone.calling();
//		vodaphone.data();
//		System.out.println("calling");
		
		
		Sim sim=new Vodaphone();
		sim.calling();
		sim.data();
		
		
	}

}
