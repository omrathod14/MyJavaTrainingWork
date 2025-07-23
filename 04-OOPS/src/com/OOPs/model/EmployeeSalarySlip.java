package com.OOPs.model;

public class EmployeeSalarySlip {

	String name;
	int id;
	double salary;

	public EmployeeSalarySlip(String name, int id, double salary) {

		this.name = name;
		this.id = id;
		this.salary = salary;

	}
	
	double HRA=0;
	double DA=0;
	double TotalSal=0;
	public double GenerateSalSlip() {
		
		HRA=0.2*salary;
		DA=0.1*salary;
		TotalSal=salary+HRA+DA;
		
		return TotalSal;
		
	}

}
