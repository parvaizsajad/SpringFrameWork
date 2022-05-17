package com.buyRice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary

public class Bohripora implements RiceLocation{


	public void riceLocation() {
		System.out.println("The location is Bohripora");
	}

}
