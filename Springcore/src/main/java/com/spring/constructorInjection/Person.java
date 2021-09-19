package com.spring.constructorInjection;

import java.util.List;

public class Person {
  int id;
  String name;
  Certi certi;
  List<String> Companies;
public Person(int id, String name, Certi certi, List<String> Companies) {
	super();
	this.id = id;
	this.name = name;
	this.certi = certi;
	this.Companies=Companies;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", certi=" + certi + "Companies"+this.Companies+"]";
}

}
