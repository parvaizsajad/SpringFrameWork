package com.spring.constructorInjection;

public class ConstructorOverloading {
int a;
int b;
public ConstructorOverloading(float a, float b) {
	super();
	this.a = (int) a;
	this.b = (int) b;
	System.out.println("float float");
}
public ConstructorOverloading(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	System.out.println("int int ");
}

public ConstructorOverloading(String a, String b) {
	super();
	this.a = Integer.parseInt(a);
	this.b = Integer.parseInt(b);
	System.out.println("String String ");
}
@Override
public String toString() {
	return "ConstructorOverloading [a=" + a + ", b=" + b + "]";
}

}
