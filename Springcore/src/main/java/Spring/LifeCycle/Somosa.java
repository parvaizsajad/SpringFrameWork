package Spring.LifeCycle;

public class Somosa {
private double price;

public Somosa(double price) {
	this.price = price;
	System.out.println("this is the argumented constructor");
}

public double getPrice() {
	System.out.println("this is the getter");
	return price;
	
}

public void setPrice(double price) {
	this.price = price;
	System.out.println("this is the setter");
}

public Somosa() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("this is the default constructor");
}

@Override
public String toString() {
	return "Somosa [price=" + price + "]";
}
public void init() {
	System.out.println("this is the init method");
}
public void destroy() {
	System.out.println("this is the destroy method");
}
}
