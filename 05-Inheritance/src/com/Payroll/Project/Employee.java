package com.Payroll.Project;

public class Employee {
	int employeeId;
	String name;
	double salary;
	JobRole role;

	public Employee(int employeeId, String name, double salary, JobRole role) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.role = role;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public JobRole getRole() {
		return role;
	}

	public void setRole(JobRole role) {
		this.role = role;
	}

	public double calculateBonus() {
		switch (role) {
		case MANAGER:
			return salary * 0.20;
		case DEVELOPER:
			return salary * 0.15;
		case DESIGNER:
			return salary * 0.15;
		default:
			return salary * 0.10;
		}
	}

	public void displayDetails() {
		System.out.println("ID: " + employeeId + ", Name: " + name + ", Role: " + role + ", Salary: " + salary
				+ ", Bonus: " + calculateBonus());
	}
}
