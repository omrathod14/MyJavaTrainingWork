package com.inheritance.model;

public class Employee extends Person {
	public void showRole() {
		System.out.println("I am an Employee");
	}
	
	@Override
	public void DisplayDetails() {
		System.out.println("I am Coporate employee");
	}

}
