package LifeCycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class jelabi {
private double price;

@Override
public String toString() {
	return "jelabi [price=" + price + "]";
}

public jelabi() {
	super();
	// TODO Auto-generated constructor stub
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
@PostConstruct
public void start() {
	System.out.println("we are inside the init method");
}
@PreDestroy
public void end() {
	System.out.println("we are inside the destroy method");
}
}
