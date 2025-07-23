package com.Abstractmodel.model;

public abstract class Employee {
	String name;
	int id;

	Employee() {

	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
    
	public String getname() {
		return name;
	}
	public abstract double CalculateSalary();

}
