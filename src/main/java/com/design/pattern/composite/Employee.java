package com.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	String name;
	String dept;
	public Employee() {
		super();
	}

	List<Employee> subordinates = new ArrayList<Employee>();
	
	public void add(Employee e){
		this.subordinates.add(e);
	}
	
	public void remove(Employee e){
		this.subordinates.remove(e);
	}
	
}
