package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       @SuppressWarnings("resource")
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("heartHumanBean.xml");
       Human bean = applicationContext.getBean("human",Human.class);
       bean.isAlive();
      
      
    }
}
