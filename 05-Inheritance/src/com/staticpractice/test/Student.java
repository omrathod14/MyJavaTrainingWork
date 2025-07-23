package com.staticpractice.test;

public class Student {
	String name;
	static String college="SIES";
	
	public Student(String name) {
		this.name=name;
	}
	
	public void showdetails() {
		System.out.println("Name: "+name+", CollegeName:"+college);
	}
}
