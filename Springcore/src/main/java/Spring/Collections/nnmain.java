package Spring.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class nnmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ApplicationContext context = new ClassPathXmlApplicationContext("Spring/Collections/configCollections.xml");
  Emp emp= (Emp) context.getBean("Emp");
  System.out.println(emp);
	}

}
