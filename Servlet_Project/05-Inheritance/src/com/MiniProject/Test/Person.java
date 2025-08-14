package com.MiniProject.Test;

public class Person {
	String name;
	Departments department;
	
	public Person() {
		
	}
	
	public Person(String name,Departments department) {
		this.name=name;
		this.department=department;
	}
	
	public void getdetails() {
		 System.out.println("Name: "+name+"Department: "+department);
	}

}
