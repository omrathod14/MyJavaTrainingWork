package com.aurionpro.model;

public class Student {
	
	String name;
	int roll_no;
	double cgpa;
	
	public Student(String name, int roll_no , double cgpa){
		this.name=name;
		this.roll_no=roll_no;
		this.cgpa=cgpa;
	}
	
	public void display() {
		System.out.println("Name:"+name+"Rollno:"+roll_no+"CGPA:"+cgpa);
		System.out.println("_____________________________________________");
	}

}
