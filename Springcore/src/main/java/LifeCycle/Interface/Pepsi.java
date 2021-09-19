package LifeCycle.Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
private double price;

public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("we are under destroy interface bean");
	
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("we are under init beans");
	
}

}
