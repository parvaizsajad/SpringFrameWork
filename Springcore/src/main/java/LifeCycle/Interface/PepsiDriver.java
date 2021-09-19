package LifeCycle.Interface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.LifeCycle.Somosa;

public class PepsiDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext cop = new ClassPathXmlApplicationContext("LifeCycle/Interface/PepsiConfig.xml");
		 Pepsi so=(Pepsi)cop.getBean("pep");
		 System.out.println(so);
		 cop.registerShutdownHook();
	}

}
