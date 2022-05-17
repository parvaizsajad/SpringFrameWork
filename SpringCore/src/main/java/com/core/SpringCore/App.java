package com.core.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.Student.Student;
import com.seleniumExpress.ioc.Sim;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       @SuppressWarnings("resource")
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
       HelloWorld bean = applicationContext.getBean("helloWorld",HelloWorld.class);
       bean.printhello();
       
       
       Sim sim=applicationContext.getBean("Sim",Sim.class);
       sim.calling();
       sim.data();
       
       Student student = applicationContext.getBean("Student",Student.class);
       System.out.println(student);
       student.totalmarks();
       
       com.StudentCheating.Student student2 = applicationContext.getBean("StudentCheat",com.StudentCheating.Student.class);
       student2.studentCheating();
      
    }
}
