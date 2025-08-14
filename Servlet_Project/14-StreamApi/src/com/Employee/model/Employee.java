package com.Employee.model;

public class Employee {
	public String name;
	public double salary;
	public String joiningDate;
	public String gender;

	public Employee(String name, double salary, String joiningDate, String gender) {
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.gender = gender;
	}
	
	public void getSalary(double salary)
	{
		this.salary=salary;
	}

	@Override
	public String toString() {
		return name + " | ₹" + salary + " | " + joiningDate + " | " + gender;
	}
}
