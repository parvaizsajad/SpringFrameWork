package com.spring.constructorInjection;

public class Certi {
String certi;

@Override
public String toString() {
	return "[" + certi + "]";
}

public Certi(String certi) {
	super();
	this.certi = certi;
}
}
