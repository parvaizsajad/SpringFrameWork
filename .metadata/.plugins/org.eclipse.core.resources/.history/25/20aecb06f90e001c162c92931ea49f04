package com.springCore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/reference/configRef.xml");
    ReferenceA a=(ReferenceA) context.getBean("aref");
    System.out.println(a);
    System.out.println(a.getOb().getY());
	}

}
