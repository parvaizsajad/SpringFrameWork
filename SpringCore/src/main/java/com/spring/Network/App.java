package com.spring.Network;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class App 
{
    public static void main( String[] args )
    {
       @SuppressWarnings("resource")
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
      Sim sim = applicationContext.getBean("sim",Sim.class);
      sim.service();
    }
}
