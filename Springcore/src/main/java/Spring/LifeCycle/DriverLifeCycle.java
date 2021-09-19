package Spring.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverLifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractApplicationContext cop = new ClassPathXmlApplicationContext("Spring/LifeCycle/SomasaConfig.xml");
 Somosa so=(Somosa)cop.getBean("Som");
 System.out.println(so);
 cop.registerShutdownHook();
 
 
	}

}
